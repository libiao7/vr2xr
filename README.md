<p align="center">
  <a href="https://buymeacoffee.com/skarian" target="_blank" rel="noopener noreferrer">
    <img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;">
  </a>
</p>

<p align="center">
  <img src="assets/banner.png" alt="vr2xr" width="100%">
</p>

**vr2xr is an Android VR180 SBS player with phone-only side-by-side stereo mode for a mobile VR headset, as well as optional XREAL One external-display playback.**

---

<p align="center">
  <img src="./assets/screenshots/framed/01-home-framed.png" alt="vr2xr home" width="22%">
  &nbsp;
  <img src="./assets/screenshots/framed/02-calibration-framed.png" alt="vr2xr calibration setup" width="22%">
  &nbsp;
  <img src="./assets/screenshots/framed/03-sbs-mode-framed.png" alt="vr2xr sbs mode setup" width="22%">
  &nbsp;
  <img src="./assets/screenshots/framed/04-player-framed.png" alt="vr2xr player controls" width="22%">
</p>

## Features

- **Phone VR-box mode**: Play VR180 SBS directly on the phone in landscape orientation, split into left/right eye views; no XR glasses required
- **XREAL One Compatible**: Optional external-display playback and live head tracking
- **Flexible Source Input**: Open local files, `http(s)` video URLs, or share media links/files from other Android apps
- **Guided Setup**: Flat-surface calibration first, then SBS readiness before entering the VR player
- **In-Player Tracking Controls**: Recalibrate anytime, tune IMU sensitivity, and toggle IMU tracking on or off
- **Runtime Projection FOV Tuning**: Adjust a shared `FOV` slider in Projection Settings and see changes immediately on phone and glasses
- **Phone Playback Controls**: On-phone controls for play/pause, 15-second seek, and timeline scrubbing
- **Touchpad View Adjustment**: Drag to adjust view orientation with continuous edge auto-drag for smooth movement
- **Durable Playback Sessions**: Handles output interruptions and resumes cleanly into the active playback session

## Player Controls

<p align="center">
  <img src="assets/controls-explained.png" alt="vr2xr player controls explained" width="75%">
</p>

## Requirements

- Android 13+ phone (`minSdk = 33`)
- A phone VR headset/cardboard viewer is optional for stereoscopic viewing; XREAL One/One Pro is only needed for external-display mode
- Samsung DeX desktop mode is not supported (use screen mirroring instead)

## App Guide

1. Open a local video, paste an `http(s)` URL, or share a video into the app.
2. The player opens in landscape and renders the left and right views from a VR180 SBS source on the phone screen.
3. Put the phone into a compatible VR viewer and align the two screen halves with your eyes.
4. Use the on-screen touch area to adjust the viewing direction; use playback controls to pause, seek, and scrub the timeline.

For VR180 SBS input, each eye is sampled from its corresponding half of the source video. Phone-only playback does not require XR hardware or IMU calibration.

## Video Sources

- Local video files
- `http(s)` video URLs
- Android share targets (video links/files)

## Install

Preferred: Join the Play Store closed test so we can reach the requirement of 12 testers for 14 consecutive days before public release.

1. Join the tester group: https://groups.google.com/g/vr2xr-testers
2. Accept the testing invite: https://play.google.com/apps/testing/com.vr2xr
3. Install the app from Play: https://play.google.com/store/apps/details?id=com.vr2xr

If you are not interested in becoming a tester, debug APKs are still published to versioned GitHub Releases when semantic tags (`v*.*.*`) are pushed.
You can download `vr2xr.apk` from the release tag you want to install: https://github.com/skarian/vr2xr/releases

For a shareable tester onboarding page, see `PLAY_STORE_TESTING.md`.

## For Developers

Development setup, build/test commands, diagnostics, and project structure are in `CONTRIBUTING.md`.
