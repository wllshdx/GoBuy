package com.gobuy.service;

import com.gobuy.pojo.TbItemCat;

import java.util.List;

/**
 * Created by ldb on 2017/5/6.
 */
public interface ItemCatService {

    public List<TbItemCat> getItemCatList(Long parentId) throws Exception;
}