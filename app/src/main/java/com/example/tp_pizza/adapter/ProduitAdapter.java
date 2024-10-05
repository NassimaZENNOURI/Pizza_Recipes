package com.example.tp_pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp_pizza.R;
import com.example.tp_pizza.beans.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {

    private List<Produit> produits ;
    private LayoutInflater inflater ;

    public ProduitAdapter(List<Produit> produits, Activity activity){
        this.produits = produits;
        //permet d'obtenir un service système Android, dans ce cas, le LayoutInflater qui sera utilisé pour créer les éléments visuels à afficher dans la liste.
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null )
            view = inflater.inflate(R.layout.item,null);
        TextView nom = view.findViewById(R.id.recipeTitle);
        TextView nbrIngred = view.findViewById(R.id.servingText);
        TextView time = view.findViewById(R.id.timeText);
        ImageView imag = view.findViewById(R.id.pizzaImage);
        //ImageView iconTime = view.findViewById(R.id.timeIcon);
        //ImageView iconHomme = view.findViewById(R.id.servingIcon);

        nom.setText(produits.get(i).getNom());
        nbrIngred.setText(produits.get(i).getNbrIngredients()+"");
        time.setText(produits.get(i).getDuree());
        imag.setImageResource(produits.get(i).getPhoto());

        return view;
    }
}
