# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/robidev/smvScope.git;protocol=https;branch=main"
SRCREV = "8dabf33a255d80c745770b0e8f872eb2ff982c42"

# this could be relevant, if we want to (re)run ctypesgen on the host, with the lib61850.so 
# that will be included in the build. Currently we include a pre-baked one
# it should not matter as long as the version/API matches, 
#DEPENDS = "libiec61850"

RDEPENDS_${PN} = "\
    libiec61850 \
    ${PYTHON_PN}-flask \
"

S = "${WORKDIR}/git"

inherit setuptools3

CLEANBROKEN = "1"
