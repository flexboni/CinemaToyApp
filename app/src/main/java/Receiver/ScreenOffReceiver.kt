package Receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import java.time.LocalDate

class ScreenOffReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when{
            // 화면이 꺼질 때 오는 브로드캐스트 메세지인 경우 토스트 출력
            intent?.action == Intent.ACTION_SCREEN_OFF -> {
                Log.d("ScreenOffReceiver", "퀴즈잠금: 화면이 꺼졌습니다.")
                Toast.makeText(context, "퀴즈잠금: 화면이 꺼졌습니다.", Toast.LENGTH_LONG).show()
            }
        }
    }

}