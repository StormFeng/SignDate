package com.lida.signdate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/16.
 */

public class SignDate extends LinearLayout {

    private TextView tvYear;
    private InnerGridView gvWeek;
    private InnerGridView gvDate;
    private AdapterDate adapterDate;

    public SignDate(Context context) {
        super(context);
        init();
    }

    public SignDate(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SignDate(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        View view = View.inflate(getContext(),R.layout.layout_signdate,this);
        tvYear = view.findViewById(R.id.tvYear);
        gvWeek = view.findViewById(R.id.gvWeek);
        gvDate = view.findViewById(R.id.gvDate);
        tvYear.setText(DateUtil.getCurrentYearAndMonth());
        gvWeek.setAdapter(new AdapterWeek(getContext()));
        adapterDate = new AdapterDate(getContext());
        gvDate.setAdapter(adapterDate);
    }

    /**
     * 签到成功的回调
     * @param onSignedSuccess
     */
    public void setOnSignedSuccess(OnSignedSuccess onSignedSuccess){
        adapterDate.setOnSignedSuccess(onSignedSuccess);
    }
}
