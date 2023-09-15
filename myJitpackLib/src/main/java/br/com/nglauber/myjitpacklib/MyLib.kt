import android.content.Context
import android.graphics.drawable.Drawable
import br.com.nglauber.myjitpacklib.R

object MyLib {
    fun sayHello(): String {
        return "Hello from MyLib 1"
    }

    fun getGreenBot(context: Context): Drawable? {
        return context.getDrawable(R.drawable.ic_android_green_bot)
    }
}