package com.klchnkvv.savage.cupsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;
    Button new_game;

    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById((R.id.right));

        new_game = (Button)findViewById(R.id.new_game);

        cards = new ArrayList<>();
        cards.add(110); // 10 of hearts
        cards.add(210); // 10 of spades
        cards.add(310); // joker

        Collections.shuffle(cards);

        new_game.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.card_back);
                middle.setImageResource(R.drawable.card_back);
                right.setImageResource(R.drawable.card_back);

                Animation left_animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation middle_animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation right_animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                left.startAnimation(left_animation);
                middle.startAnimation(middle_animation);
                right.startAnimation(right_animation);

            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cards.get(0) == 110) {
                    left.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(0) == 210) {
                    left.setImageResource(R.drawable.of_spades);
                } else if (cards.get(0) == 310) {
                    left.setImageResource(R.drawable.joker);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }

                if (cards.get(1) == 110) {
                    middle.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(1) == 210) {
                    middle.setImageResource(R.drawable.of_spades);
                } else if (cards.get(1) == 310) {
                    middle.setImageResource(R.drawable.joker);
                }

                if (cards.get(2) == 110) {
                    right.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(2) == 210) {
                    right.setImageResource(R.drawable.of_spades);
                } else if (cards.get(2) == 310) {
                    right.setImageResource(R.drawable.joker);
                }
            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cards.get(1) == 110) {
                    middle.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(1) == 210) {
                    middle.setImageResource(R.drawable.of_spades);
                } else if (cards.get(1) == 310) {
                    middle.setImageResource(R.drawable.joker);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }

                if (cards.get(0) == 110) {
                    left.setImageResource(R.drawable.of_hearts);
                 } else if (cards.get(0) == 210) {
                    left.setImageResource(R.drawable.of_spades);
                } else if (cards.get(0) == 310) {
                    left.setImageResource(R.drawable.joker);
                }

                if (cards.get(2) == 110) {
                    right.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(2) == 210) {
                    right.setImageResource(R.drawable.of_spades);
                } else if (cards.get(2) == 310) {
                    right.setImageResource(R.drawable.joker);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cards.get(2) == 110) {
                    right.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(2) == 210) {
                    right.setImageResource(R.drawable.of_spades);
                } else if (cards.get(2) == 310) {
                    right.setImageResource(R.drawable.joker);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                }

                if (cards.get(1) == 110) {
                    middle.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(1) == 210) {
                    middle.setImageResource(R.drawable.of_spades);
                } else if (cards.get(1) == 310) {
                    middle.setImageResource(R.drawable.joker);
                }

                if (cards.get(0) == 110) {
                    left.setImageResource(R.drawable.of_hearts);
                } else if (cards.get(0) == 210) {
                    left.setImageResource(R.drawable.of_spades);
                } else if (cards.get(0) == 310) {
                    left.setImageResource(R.drawable.joker);
                }
            }
        });
    }
}
