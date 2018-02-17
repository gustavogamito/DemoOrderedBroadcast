package br.com.gustavogamito.demoorderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * Created by logonrm on 17/02/2018.
 */
class MeuReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("DEMOORDERED", "Receiver") //To change body of created functions use File | Settings | File Templates.
    }

}