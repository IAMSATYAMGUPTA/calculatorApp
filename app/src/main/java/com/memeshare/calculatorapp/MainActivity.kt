package com.memeshare.calculatorapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

class MainActivity : AppCompatActivity() {
    lateinit var expression: TextView
    lateinit var result: TextView

    lateinit var BtnC: Button
    lateinit var Btn7: Button
    lateinit var Btn4: Button
    lateinit var Btn1: Button
    lateinit var Btn00: Button

    lateinit var BtnBack: ImageView
    lateinit var Btn8: Button
    lateinit var Btn5: Button
    lateinit var Btn2: Button
    lateinit var Btn0: Button

    lateinit var BtnPercentage: Button
    lateinit var Btn9: Button
    lateinit var Btn6: Button
    lateinit var Btn3: Button
    lateinit var BtnDot: Button

    lateinit var BtnDivide: Button
    lateinit var BtnMultiply: Button
    lateinit var BtnPlus: Button
    lateinit var BtnMinus: Button
    lateinit var BtnEqual: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression = findViewById(R.id.expression)
        result = findViewById(R.id.result)

        BtnC = findViewById(R.id.BtnC)
        Btn7 = findViewById(R.id.Btn7)
        Btn4 = findViewById(R.id.Btn4)
        Btn1 = findViewById(R.id.Btn1)
        Btn00 = findViewById(R.id.Btn00)

        BtnBack = findViewById(R.id.BtnBack)
        Btn8 = findViewById(R.id.Btn8)
        Btn5 = findViewById(R.id.Btn5)
        Btn2 = findViewById(R.id.Btn2)
        Btn0 = findViewById(R.id.Btn0)

        BtnPercentage = findViewById(R.id.BtnPercentage)
        Btn9 = findViewById(R.id.Btn9)
        Btn6 = findViewById(R.id.Btn6)
        Btn3 = findViewById(R.id.Btn3)
        BtnDot = findViewById(R.id.BtnDot)

        BtnDivide = findViewById(R.id.BtnDivide)
        BtnMultiply = findViewById(R.id.BtnMultiply)
        BtnPlus = findViewById(R.id.BtnPlus)
        BtnMinus = findViewById(R.id.BtnMinus)
        BtnEqual = findViewById(R.id.BtnEqual)

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true

        var str : String

        Btn00.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "00"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "00"
                expressionText(str)
                resultText()
            }
        }

        Btn1.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "1"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "1"
                expressionText(str)
                resultText()
            }
        }

        Btn4.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "4"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "4"
                expressionText(str)
                resultText()
            }
        }

        Btn7.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "7"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "7"
                expressionText(str)
                resultText()
            }
        }

        Btn8.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "8"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "8"
                expressionText(str)
                resultText()
            }
        }

        Btn5.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "5"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "5"
                expressionText(str)
                resultText()
            }
        }

        Btn2.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "2"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "2"
                expressionText(str)
                resultText()
            }
        }

        Btn0.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "0"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "0"
                expressionText(str)
                resultText()
            }
        }

        Btn9.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "9"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "9"
                expressionText(str)
                resultText()
            }
        }

        Btn6.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "6"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "6"
                expressionText(str)
                resultText()
            }
        }

        Btn3.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "3"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "3"
                expressionText(str)
                resultText()
            }
        }

        BtnDot.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "."
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "."
                expressionText(str)
                resultText()
            }
        }


        BtnC.setOnClickListener{

            expression.textSize = 60F
            expression.setTextColor(Color.parseColor("#FF000000"))

            result.textSize = 35F
            result.setTextColor(Color.parseColor("#75000000"))

            expressionText("0")
            resultText()
        }

        BtnBack.setOnClickListener{
            if (expression.text.toString().length > 0){
                var lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0,lastIndex)
                expressionText(str)
                resultText()
            }
            else{
                expressionText("0")
                resultText()
            }
        }

        BtnPercentage.setOnClickListener{
            if (expression.text.toString().endsWith("*") || expression.text.toString().endsWith("%") || expression.text.toString().endsWith("/") || expression.text.toString().endsWith("+") || expression.text.toString().endsWith("-")){
                str = expression.text.toString()
                expressionText(str)
            }
            else{
                str = expression.text.toString() + "%"
                expressionText(str)
            }
        }

        BtnDivide.setOnClickListener{
            if (expression.text.toString().endsWith("*") || expression.text.toString().endsWith("%") || expression.text.toString().endsWith("/") || expression.text.toString().endsWith("+") || expression.text.toString().endsWith("-")){
                str = expression.text.toString()
                expressionText(str)
            }
            else{
                str = expression.text.toString() + "/"
                expressionText(str)
            }
        }

        BtnMultiply.setOnClickListener{
            if (expression.text.toString().endsWith("*") || expression.text.toString().endsWith("%") || expression.text.toString().endsWith("/") || expression.text.toString().endsWith("+") || expression.text.toString().endsWith("-")){
                str = expression.text.toString()
                expressionText(str)
            }
            else{
                str = expression.text.toString() + "*"
                expressionText(str)
            }
        }

        BtnMinus.setOnClickListener{
            if (expression.text.toString().endsWith("*") || expression.text.toString().endsWith("%") || expression.text.toString().endsWith("/") || expression.text.toString().endsWith("+") || expression.text.toString().endsWith("-")){
                str = expression.text.toString()
                expressionText(str)
            }
            else{
                str = expression.text.toString() + "-"
                expressionText(str)
            }
        }

        BtnPlus.setOnClickListener{
            if (expression.text.toString().endsWith("*") || expression.text.toString().endsWith("%") || expression.text.toString().endsWith("/") || expression.text.toString().endsWith("+") || expression.text.toString().endsWith("-")){
                str = expression.text.toString()
                expressionText(str)
            }
            else{
                str = expression.text.toString() + "+"
                expressionText(str)
            }
        }

        BtnEqual.setOnClickListener{
            expression.textSize = 35F
            expression.setTextColor(Color.parseColor("#75000000"))
            str = result.text.toString().replace("= ","")
            expression.text = str

            result.textSize = 60F
            result.setTextColor(Color.parseColor("#FF000000"))
            result.text = result.text.toString()

        }

    }


    private fun expressionText(str:String){

        expression = findViewById(R.id.expression)
        expression.text = str

    }

    private fun resultText() {
        expression = findViewById(R.id.expression)
        var exp = expression.text.toString()

        result = findViewById(R.id.result)

        val engine: ScriptEngine = ScriptEngineManager().getEngineByName("rhino")

        try {
            val res = engine.eval(exp)
            if (res.toString().endsWith(".0")){
                result.text = "= " + res.toString().replace(".0", "")
            }
            else{
                result.text = "= " + res.toString()
            }
        }
        catch (e:Exception){

            expression.text = expression.text.toString()
            result.text = result.text.toString()

        }
    }

}