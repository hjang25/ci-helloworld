# Task 3

GitHub repo URL: REPLACE_WITH_PUBLIC_GITHUB_REPO_URL

Docker Hub image URL: REPLACE_WITH_PUBLIC_DOCKER_HUB_IMAGE_URL

Observed failure reason after adding `countOf` without tests:
- The Jacoco step failed because branch coverage dropped below the configured threshold.
- In this workflow, the relevant threshold is `fail-if-branches-less-than: 100`.
- For this homework version, the workflow is also configured to fail if either code coverage or branch coverage decreases relative to the previous run.
