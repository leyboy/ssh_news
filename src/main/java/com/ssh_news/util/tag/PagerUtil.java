package com.ssh_news.util.tag;

import com.ssh_news.bean.Pager;
import static com.ssh_news.util.commons.NewsConstants.DEFAULT_PER_PAGE_SIZE;

/**
 * @author LiuEnYuan
 * @version 1.1 pager util 分页工具类
 **/
public final class PagerUtil {

	/**
	 * create page object
	 **/
	public static Pager createPage(int curPage, int perPageSize, int totalRecordSize) {
		int totalPageSize = getTotalPageSize(perPageSize, totalRecordSize);
		boolean hasPreviousPage = isHasPreviousPage(curPage);
		boolean hasNextPage = isHasNextPage(curPage, totalPageSize);
		curPage = getCurPage(curPage);
		perPageSize = getPerPageSize(perPageSize);
		return new Pager(curPage, perPageSize, totalPageSize, totalRecordSize, hasPreviousPage, hasNextPage);
	}

	/**
	 * get per page size
	 **/
	public static int getPerPageSize(int perPageSize) {
		return (perPageSize <= DEFAULT_PER_PAGE_SIZE) ? DEFAULT_PER_PAGE_SIZE : perPageSize;
	}

	/**
	 * get current page
	 **/
	public static int getCurPage(int curPage) {
		return curPage == 0 ? 1 : curPage;
	}

	/**
	 * get total page size
	 **/
	public static int getTotalPageSize(int perPageSize, int totalRecordSize) {
		int totalPageSize = 0;
		if (totalRecordSize != 0 && totalPageSize % perPageSize == 0) {
			totalPageSize = totalRecordSize / perPageSize;
		} else {
			totalPageSize = totalRecordSize / perPageSize + 1;
		}
		return totalPageSize;
	}

	/**
	 * judge has previous page
	 **/
	public static boolean isHasPreviousPage(int curPage) {
		return curPage == 1 ? false : true;
	}

	/**
	 * judge has next page
	 **/
	public static boolean isHasNextPage(int curPage, int totalPageSize) {
		return totalPageSize == 0 || curPage == totalPageSize ? false : true;
	}

}
