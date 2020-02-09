package org.voutixcloud.functions

import org.voutixcloud.managment.createFiles
import org.voutixcloud.utils.sendStartMessage

fun startCloud() {

    createFiles()
    sendStartMessage()

}