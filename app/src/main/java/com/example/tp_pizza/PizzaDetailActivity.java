package com.example.tp_pizza;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizza_detail);

        // Récupérer les données envoyées depuis MainActivity
        String nomPizza = getIntent().getStringExtra("nomPizza");
        String Ingredients = getIntent().getStringExtra("Ingredients");
        int imagePizza = getIntent().getIntExtra("imagePizza", 0);
        String descriptionPizza = getIntent().getStringExtra("descriptionPizza");
        String preparation = getIntent().getStringExtra("preparation");

        // Trouver les vues
        TextView nomTextView = findViewById(R.id.nomPizza);
        TextView ingredientsText = findViewById(R.id.Ingredients);
        ImageView imageView = findViewById(R.id.imagePizza);
        TextView descriptionTextView = findViewById(R.id.descriptionPizza);
        TextView preparationTextView = findViewById(R.id.preparation);


        // Définir les valeurs
        nomTextView.setText(nomPizza);
        ingredientsText.setText(Ingredients);
        imageView.setImageResource(imagePizza);
        descriptionTextView.setText(descriptionPizza);
        preparationTextView.setText(preparation);



    }
}