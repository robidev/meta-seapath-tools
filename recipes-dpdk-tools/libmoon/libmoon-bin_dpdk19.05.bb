# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7ec8d36f51d26e4dda4bafb6a58d059f"

FILESEXTRAPATHS_append := "${THISDIR}:"

SRC_URI = "git://github.com/libmoon/libmoon.git;branch=dpdk-19.05"
SRC_URI += " file://CMakeLists.txt.patch "

SRCREV = "71998d4466cdfe378904819e0699af503b9c4f8e"
DEPENDS = "dpdk pciutils highwayhash luajit tbb libpthread-stubs coreutils-native numactl" 
RDEPENDS_${PN} += "dpdk pciutils highwayhash luajit tbb"

S = "${WORKDIR}/git"

inherit cmake

do_configure_prepend() {
    cd ${WORKDIR}/git
    git submodule update --init --recursive
}

## for a binary to be used directly with lua scripts
do_install() {
    install -d ${D}${bindir}
    install -m 0755 libmoon ${D}${bindir}
}

## for a shared library such as used by moongen
# EXTRA_OECMAKE += "-DLIBMOON_BUILD_LIBRARY=true"
#
# do_install() {
#     install -d ${D}${libdir}
#     install -m 0755 libmoon.a ${D}${libdir}
# }
