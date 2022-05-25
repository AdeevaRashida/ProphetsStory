package com.adeeva.chores.prophetsstory.view.content

import android.graphics.text.LineBreaker
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adeeva.chores.prophetsstory.R
import com.adeeva.chores.prophetsstory.model.ResponseMain
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private var item: ResponseMain? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Detail Kisah Nabi"

        initView()
    }

    private fun initView() {
        item = intent?.getParcelableExtra("data")

        tv_detail_name.setText(item?.name)
        tv_birth_date.setText(item?.thn_kelahiran)
        tv_detail_tempat.setText(item?.tmp)
        tv_usia.setText(item?.usia)
        tv_detail_desc.setText(item?.description)

        Glide.with(this)
            .load(item?.image_url)
            .apply(
                RequestOptions()
                    .override(500,500)
                    .placeholder(R.drawable.ic_launcher_background)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .priority(Priority.HIGH))
            .into(iv_detail)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            tv_detail_desc.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD

    }
}