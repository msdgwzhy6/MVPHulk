package com.madreain.hulk.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.madreain.hulk.mvp.IView;
import com.madreain.hulk.view.baseviewholder.HulkViewHolder;

import java.util.List;

import javax.inject.Inject;


/**
 * @author madreain
 * @date 2019-07-05.
 * module：
 * description：
 */
public abstract class BaseMultiAdapter<T extends MultiItemEntity, V extends IView> extends BaseMultiItemQuickAdapter<T, HulkViewHolder> {

    public abstract void addItemType();

    public BaseMultiAdapter(List<T> data) {
        super(data);
        addItemType();
    }

    @Inject
    public V view;

    public Context getContext() {
        return mContext;
    }

    public void clearData() {
        getData().clear();
        notifyDataSetChanged();
    }

}
