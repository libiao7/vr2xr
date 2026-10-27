package com.vr2xr.display

import org.junit.Assert.assertEquals
import org.junit.Test

class DisplayRouteStateMachineTest {
    private val machine = DisplayRouteStateMachine()

    @Test
    fun externalActiveRoutesToExternalSurface() {
        val decision = machine.decide(
            DisplayRouteSnapshot(
                externalDisplayId = 7,
                externalSurfaceReady = true,
                internalSurfaceReady = false,
                activeRoute = ActiveRoute.NONE,
                activeSurfaceBound = true
            )
        )

        assertEquals(DisplayRouteState.ExternalActive(7), decision.state)
        assertEquals(RouteTarget.EXTERNAL, decision.target)
    }

    @Test
    fun externalPendingHoldsExistingExternalRoute() {
        val decision = machine.decide(
            DisplayRouteSnapshot(
                externalDisplayId = 7,
                externalSurfaceReady = false,
                internalSurfaceReady = false,
                activeRoute = ActiveRoute.EXTERNAL,
                activeSurfaceBound = true
            )
        )

        assertEquals(DisplayRouteState.ExternalPending(7), decision.state)
        assertEquals(RouteTarget.HOLD_CURRENT, decision.target)
    }

    @Test
    fun externalPendingClearsOutputInsteadOfSwitching() {
        val decision = machine.decide(
            DisplayRouteSnapshot(
                externalDisplayId = 7,
                externalSurfaceReady = false,
                internalSurfaceReady = false,
                activeRoute = ActiveRoute.NONE,
                activeSurfaceBound = true
            )
        )

        assertEquals(DisplayRouteState.ExternalPending(7), decision.state)
        assertEquals(RouteTarget.NONE, decision.target)
    }

    @Test
    fun internalDisplayRoutesToPhoneWhenNoExternalDisplayExists() {
        val decision = machine.decide(
            DisplayRouteSnapshot(
                externalDisplayId = null,
                externalSurfaceReady = false,
                internalSurfaceReady = true,
                activeRoute = ActiveRoute.NONE,
                activeSurfaceBound = false
            )
        )

        assertEquals(DisplayRouteState.InternalActive, decision.state)
        assertEquals(RouteTarget.INTERNAL, decision.target)
    }

    @Test
    fun noOutputWhenExternalDisplayIsGone() {
        val decision = machine.decide(
            DisplayRouteSnapshot(
                externalDisplayId = null,
                externalSurfaceReady = false,
                internalSurfaceReady = false,
                activeRoute = ActiveRoute.EXTERNAL,
                activeSurfaceBound = true
            )
        )

        assertEquals(DisplayRouteState.NoOutput, decision.state)
        assertEquals(RouteTarget.NONE, decision.target)
    }
}
