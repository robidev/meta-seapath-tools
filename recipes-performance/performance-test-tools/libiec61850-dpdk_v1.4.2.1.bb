# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/robidev/libiec61850.git;branch=dpdk"
SRCREV = "bf5530471ca909a368982d1f51f40c6595f7523f"

DEPENDS = "libpthread-stubs dpdk numactl"

S = "${WORKDIR}/git"

inherit cmake

