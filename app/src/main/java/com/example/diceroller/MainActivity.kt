package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import java.util.*
import android.widget.Button as Button1
import android.widget.ImageView as ImageView1


class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView1
    private lateinit var diceImage2: ImageView1
    private lateinit var diceImage3: ImageView1
    private lateinit var diceImage4: ImageView1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //now dont use//val animationRotateCorner : Animation = AnimationUtils.loadAnimation(
           // this, R.anim.rotate_corner)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)
        diceImage4 = findViewById(R.id.dice_image4)

        val rollButton: Button1 = findViewById(R.id.roll_button)
        val clearButton: Button1 = findViewById(R.id.clear_button)

        clearButton.setOnClickListener {
            clearDice()
        }

        val oneDice: Button1 = findViewById(R.id.one_dice)
        oneDice.setOnClickListener{
            visOneDice()
            rollButton.setOnClickListener{
                aniOneDice()
                rollDice()
            }
        }
        val twoDice: Button1 = findViewById(R.id.two_dice)
        twoDice.setOnClickListener{
            visTwoDice()
            rollButton.setOnClickListener{
                aniTwoDice()
                rollDice()
            }
        }
        val threeDice: Button1 = findViewById(R.id.three_dice)
        threeDice.setOnClickListener{
            visThreeDice()
            rollButton.setOnClickListener{
                aniThreeDice()
                rollDice()
            }
        }
        val fourDice: Button1 = findViewById(R.id.four_dice)
        fourDice.setOnClickListener{
            visFourDice()
            rollButton.setOnClickListener{
                aniFourDice()
                rollDice()
            }
        }


    }
    //visibility dices
    private fun visOneDice(){
        diceImage.visibility = View.VISIBLE
        diceImage2.visibility = View.GONE
        diceImage3.visibility = View.GONE
        diceImage4.visibility = View.GONE
    }
    private fun visTwoDice(){
        diceImage.visibility = View.VISIBLE
        diceImage2.visibility = View.VISIBLE
        diceImage3.visibility = View.GONE
        diceImage4.visibility = View.GONE
    }
    private fun visThreeDice(){
        diceImage.visibility = View.VISIBLE
        diceImage2.visibility = View.VISIBLE
        diceImage3.visibility = View.VISIBLE
        diceImage4.visibility = View.GONE
    }
    private fun visFourDice(){
        diceImage.visibility = View.VISIBLE
        diceImage2.visibility = View.VISIBLE
        diceImage3.visibility = View.VISIBLE
        diceImage4.visibility = View.VISIBLE
    }
    //animation dices
    private fun aniOneDice(){
        val animationRotateCenter : Animation = AnimationUtils.loadAnimation(
            this, R.anim.rotate_center)
        diceImage.startAnimation(animationRotateCenter)
    }
    private fun aniTwoDice(){
        val animationRotateCenter : Animation = AnimationUtils.loadAnimation(
            this, R.anim.rotate_center)
        diceImage.startAnimation(animationRotateCenter)
        diceImage2.startAnimation(animationRotateCenter)
    }
    private fun aniThreeDice(){
        val animationRotateCenter : Animation = AnimationUtils.loadAnimation(
            this, R.anim.rotate_center)
        diceImage.startAnimation(animationRotateCenter)
        diceImage2.startAnimation(animationRotateCenter)
        diceImage3.startAnimation(animationRotateCenter)
    }
    private fun aniFourDice(){
        val animationRotateCenter : Animation = AnimationUtils.loadAnimation(
            this, R.anim.rotate_center)
        diceImage.startAnimation(animationRotateCenter)
        diceImage2.startAnimation(animationRotateCenter)
        diceImage3.startAnimation(animationRotateCenter)
        diceImage4.startAnimation(animationRotateCenter)
    }
    //clear dices
    private fun clearDice(){
        val drawableResource = R.drawable.empty_dice
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource)
        diceImage3.setImageResource(drawableResource)
        diceImage4.setImageResource(drawableResource)

    }
    //roll dices
    private fun rollDice() {

        val drawableResource = when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource3 = when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource4 = when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)
        diceImage3.setImageResource(drawableResource3)
        diceImage4.setImageResource(drawableResource4)
    }
}