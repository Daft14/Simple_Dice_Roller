package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import java.util.*




class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView
    lateinit var diceImage3: ImageView
    lateinit var diceImage4: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val animationRotateCorner : Animation = AnimationUtils.loadAnimation(
           // this, R.anim.rotate_corner)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)
        diceImage4 = findViewById(R.id.dice_image4)

        val rollButton: Button = findViewById(R.id.roll_button)


        val onedice: Button = findViewById(R.id.one_dice)
        onedice.setOnClickListener{
            visOneDice()
            rollButton.setOnClickListener{
                aniOneDice()
                rollDice()
            }
        }
        val twodice: Button = findViewById(R.id.two_dice)
        twodice.setOnClickListener{
            visTwoDice()
            rollButton.setOnClickListener{
                aniTwoDice()
                rollDice()
            }
        }
        val threedice: Button = findViewById(R.id.three_dice)
        threedice.setOnClickListener{
            visThreeDice()
            rollButton.setOnClickListener{
                aniThreeDice()
                rollDice()
            }
        }
        val fourdice: Button = findViewById(R.id.four_dice)
        fourdice.setOnClickListener{
            visFourDice()
            rollButton.setOnClickListener{
                aniFourDice()
                rollDice()
            }
        }


    }
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