#!/usr/bin/env bash
# Copyright 2016 Google Inc. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# This script installs the tools needed to run automated tests.

set -e

if [[ -z "${GOOGLE_APPLICATION_CREDENTIALS}" ]]; then
  echo "GOOGLE_APPLICATION_CREDENTIALS must be set" 1>&2
	exit 1
fi

if [[ -z "${GOOGLE_CLOUD_PROJECT}" ]]; then
  echo "GOOGLE_CLOUD_PROJECT must be set" 1>&2
	exit 1
fi

# Install gcloud command-line utility
# https://cloud.google.com/sdk/
# First check that the command is not yet installed with `command -v`
# http://stackoverflow.com/a/677212/101923
if ! command -v gcloud  >/dev/null 2>&1; then
	(
	# Create an environment variable for the correct distribution
	export CLOUD_SDK_REPO="cloud-sdk-$(lsb_release -c -s)"

	# Add the Cloud SDK distribution URI as a package source
	echo "deb http://packages.cloud.google.com/apt $CLOUD_SDK_REPO main" | sudo tee -a /etc/apt/sources.list.d/google-cloud-sdk.list

	# Import the Google Cloud Platform public key
	curl https://packages.cloud.google.com/apt/doc/apt-key.gpg | sudo apt-key add -

	# Update the package list and install the Cloud SDK
	apt-get install -y google-cloud-sdk
	)
fi

apt-get install -y google-cloud-sdk-app-engine-java

# Use a service account to authenticate.
gcloud -q auth activate-service-account --key-file "${GOOGLE_APPLICATION_CREDENTIALS}"
gcloud -q config set project "${GOOGLE_CLOUD_PROJECT}"
gcloud info

