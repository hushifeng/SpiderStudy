#!/usr/bin/env python
#-*- coding: UTF-8 -*- 
"""
    爬虫学习demo 爬取豆瓣电影top榜
"""
import string
import re
import urllib2

class DouBanSpider(object):
    def __init__(self) :
        self.page = 1
        self.currentUrl = "http://movie.douban.com/top250?start={page}&filter=&type="
        self.topMovieInfo = []
        self.topNum = 1
        print "开始爬取"

    def getPage(self,currentPage):
        """
            url对应页面解析成html
        """
        url = self.currentUrl
        try:
            myPage = urllib2.urlopen(url.format(page = (currentPage - 1)*25)).read().decode("utf-8")
        except urllib2.URLError , e :
            if hasattr(e , "code"):
                print "Server can not fulfill the request"
                print "Error code : %s" % e.code
            elif hasattr(e , "reason"):
                print "We failed to reach a server. Please check url and read reason"
                print "Reason : %s" % e.reason
        return myPage

    def getTitle(self, myPage):
        """
            从html页面中提取出电影title
        """
        tempData = []
        movieItems = re.findall('<span class="title">(.*?)</span>',myPage,re.S)
        for index, item in enumerate(movieItems):
            if item.find("&nbsp") == -1:
                tempData.append("Top"+ str(self.topNum)+ " "+item)
                self.topNum +=1
        self.topMovieInfo.extend(tempData)

    def startSpider(self):
        """
            爬虫入口
        """
        while self.page <= 6:
            myPage = self.getPage(self.page)
            self.getTitle(myPage)
            self.page += 1
        
def main() :
    print """
        豆瓣电影Top榜单小爬虫
    """
    mySpider = DouBanSpider()
    mySpider.startSpider()
    for item in mySpider.topMovieInfo :
        print item
    print "demo结束"

if __name__ == '__main__':
    main()