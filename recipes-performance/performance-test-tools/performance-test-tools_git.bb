# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/robidev/seapath-test-tools.git;protocol=https;branch=main"
SRCREV = "6bac13cc237523382866546853cc0f8dc3fd80f0"

DEPENDS = "dpdk numactl"
RDEPENDS_${PN} = "dpdk" 

S = "${WORKDIR}/git"

inherit cmake



