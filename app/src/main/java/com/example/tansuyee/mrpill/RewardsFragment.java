package com.example.tansuyee.mrpill;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RewardsFragment extends Fragment implements View.OnClickListener{

    ImageView bean, greenDot;

    public RewardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rewards, container, false);
        bean = v.findViewById(R.id.bean);
        greenDot = v.findViewById(R.id.greenDot);
        bean.setOnClickListener(this);
        greenDot.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(final View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder
                .setMessage("Congratulations! You have successfully claimed the " + view.getTag() + " vouchers!")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        view.setVisibility(View.GONE);
                    }
                });
        alertDialogBuilder.show();
    }
}
