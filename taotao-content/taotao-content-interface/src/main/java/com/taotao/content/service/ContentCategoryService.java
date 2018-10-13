package com.taotao.content.service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;

import java.util.List;

public interface ContentCategoryService {

    List<EasyUITreeNode> getContentCategoryList(long parentId);

    TaotaoResult addContentCategory(Long parentId, String name);

    // 仅实现删除叶子节点
    TaotaoResult deleteContentCategory(Long id);
}
