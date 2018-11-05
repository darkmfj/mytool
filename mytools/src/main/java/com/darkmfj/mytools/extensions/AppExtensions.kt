package com.darkmfj.mytools.extensions

import android.content.Context
import timber.log.Timber

/**
 * get version name: v1.0.0
 */
fun Context.getVersionName(): String {
    var verName = ""
    try {
        verName = this.packageManager.getPackageInfo(this.packageName, 0).versionName
    } catch (e: Exception) {
        Timber.e("getVersionName:%s", e.message)
    }
    return verName
}

/**
 * get version code 1
 */
fun Context.getVersionCode(): Int {
    var verCode = 0
    try {
        verCode = this.packageManager.getPackageInfo(this.packageName, 0).versionCode
    } catch (e: Exception) {
        Timber.e("getVersionCode:%s", e.message)
    }
    return verCode
}
