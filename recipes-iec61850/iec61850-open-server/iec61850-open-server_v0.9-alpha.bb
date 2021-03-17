# Copyright (C) 2021, Alliander (http://www.alliander.com)
# SPDX-License-Identifier: Apache-2.0
#
# NOTE: this project uses a dual license scheme, as libiec61850 is covered by GPL 3.0
# this means that any software that incorporates this library should adhere to GPL 3.0 as well
# however, the circuit-simulator does not use libiec61850, and therefore this is apache licensed
# the circuit-simulator should normally be run on a separate, non-realtime test machine, and is 
# therefore ommitted from the recipe

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/robidev/iec61850_open_server.git;protocol=https;branch=master"
SRCREV = "415103e3fa2ef26c90555604a2b39c11763df877"

DEPENDS = "libiec61850"
RDEPENDS_${PN} = "libiec61850" 

S = "${WORKDIR}/git"

inherit cmake

_installdir = "/opt"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=${_installdir}"
FILES_${PN} = "${_installdir}/iec61850-open-server/" 


