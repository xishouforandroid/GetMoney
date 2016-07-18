package com.zhuanfa.money.getmoney.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.tencent.connect.share.QQShare;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import com.zhuanfa.money.getmoney.R;
import com.zhuanfa.money.getmoney.activity.InvitationRuleActivity;
import com.zhuanfa.money.getmoney.share.ShareManager;

import java.util.ArrayList;

/**
 * Created by tianxiying on 16/7/7.
 */
public class InvitationFragment extends Fragment implements View.OnClickListener{
    private final String TAG = "InvitationFragment";
    private View view;
    private ImageView invitation_iv;
    private Button share_qq_friend_btn;
    private Button share_qq_zone_btn;

    private Tencent mTencent;
    private IUiListener listener;
    private static final int SHARE_QQ_FRIENDS = 0;
    private static final int SHARE_QQ_ZONE = 1;
    private ShareManager shareManager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_invitation,null);
        shareManager = new ShareManager(this.getActivity());
        findView();listener = new IUiListener() {
            @Override
            public void onComplete(Object o) {
                Log.d(TAG, o.toString());

            }

            @Override
            public void onError(UiError uiError) {
                Log.d(TAG, uiError.errorMessage);
            }

            @Override
            public void onCancel() {
                Log.d(TAG, "cancel!");
            }
        };
        return view;
    }

    private void findView() {
        invitation_iv = (ImageView) view.findViewById(R.id.invitation_iv);
        share_qq_friend_btn = (Button) view.findViewById(R.id.share_qq_friend_btn);
        share_qq_zone_btn = (Button) view.findViewById(R.id.share_qq_zone_btn);

        invitation_iv.setOnClickListener(this);
        share_qq_friend_btn.setOnClickListener(this);
        share_qq_zone_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.invitation_iv:
                Intent intent = new Intent(this.getActivity(), InvitationRuleActivity.class);
                this.getActivity().startActivity(intent);
                break;
            case R.id.share_qq_friend_btn:
                qq_share(SHARE_QQ_FRIENDS);
                break;
            case R.id.share_qq_zone_btn:
                qq_share(SHARE_QQ_ZONE);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (null != mTencent)
            mTencent.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 初始化qq
     */
    private void initTencent() {
        mTencent = Tencent.createInstance(this.getString(R.string.qq_appId), this.getActivity().getApplicationContext());
    }

    /**
     * 分享到qq
     * @param type SHARE_QQ_FRIENDS:分享到QQ好友.
     *             SHARE_QQ_ZONE:分享到QQ空间
     */
    private void qq_share(int type) {
        if (null == mTencent) {
            initTencent();
        }
        Bundle params = new Bundle();
        params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, QQShare.SHARE_TO_QQ_TYPE_APP);  //设置分享类型,默认:图文
        params.putString(QQShare.SHARE_TO_QQ_TITLE, getString(R.string.share_title));   //设置分享标题
        ArrayList<String> list = new ArrayList<String>();

        params.putString(QQShare.SHARE_TO_QQ_TARGET_URL, "http://www.baidu.com"); //设置分享点击链接
        params.putString(QQShare.SHARE_TO_QQ_SUMMARY, "转发就可以赚钱,就在转发赚钱!"); //设置分享概要说明
        params.putString(QQShare.SHARE_TO_QQ_APP_NAME, "转发赚钱"); //设置分享来源

        if (type == SHARE_QQ_FRIENDS) {
            params.putString(QQShare.SHARE_TO_QQ_IMAGE_URL, shareManager.getHead_img()); //设置分享图片
            mTencent.shareToQQ(this.getActivity(), params, listener);
        }
        else if (type == SHARE_QQ_ZONE) {
            list.add(shareManager.getHead_img());
            params.putStringArrayList(QQShare.SHARE_TO_QQ_IMAGE_URL, list); //设置分享图片
            mTencent.shareToQzone(this.getActivity(), params, listener);
        }
    }
}
