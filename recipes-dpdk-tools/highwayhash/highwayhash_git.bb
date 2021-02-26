# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1e01b26bacfc2232046c90a330332b3"

SRC_URI = "git://github.com/google/highwayhash.git;branch=master"

SRCREV = "14dedecd1de87cb662f7a882ea1578d2384feb2f"
DEPENDS = "libpthread-stubs"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += "'INCDIR=${includedir}' 'LIBDIR=${libdir}'"
EXTRA_OEMAKE += "'DESTDIR=${D}' 'PREFIX=""'"

do_compile() {
    oe_runmake
}

do_install() {
   oe_runmake install
   # satisfy QA check, as the makefile builds libhighwayhash.so, while QA expects libhighwayhash.so.0
   mv ${D}${libdir}/libhighwayhash.so ${D}${libdir}/libhighwayhash.so.0
}

