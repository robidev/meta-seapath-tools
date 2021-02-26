# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/mz-automation/libiec61850.git;branch=v1.4"
SRCREV = "d798814fb463115a835da597535a625b68a39cff"

DEPENDS = "libpthread-stubs"

S = "${WORKDIR}/git"

inherit cmake

