package com.zhuanfa.money.getmoney;

import android.util.JsonReader;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void random_test() throws Exception {
        int i = (int) (Math.random()*10);
        System.out.print(i);
    }

    @Test
    public void data_test() throws Exception {
        String data = "{\"code\":0,\"size\":15,\"doc\":[{\"id\":\"14031\",\"title\":\"\\u6d45\\u8c08\\u7537\\u6027\\u8377\\u5c14\\u8499\\u4e0e\\u9752\\u6625\\u75d8\\u7684\\u5173\\u7cfb\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUEHI210-46302.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=14031\",\"content\":\"\\u4e00\\u9879\\u7814\\u7a76\\u53d1\\u73b0\\uff0c\\u7537\\u6027\\u8377\\u5c14\\u8499\\u662f\\u957f\\u9752\\u6625\\u75d8\\u7684\\u5143\\u51f6\\uff0c\\u5b83\\u4f1a\\u5f71\\u54cd\\u6bdb\\u56ca\\u76ae\\u8102\\u817a\\u7684\\u751f\\u7406\\u4ee3\\u8c22\\uff0c\\u4f7f\\u76ae\\u8102\\u817a\\u5206\\u6ccc\\u589e\\u591a\\u3001\\u6bdb\\u5b54\\u89d2\\u8d28\\u6813\\u585e\\uff0c\\u6240\\u4ee5\\u7537\\u6027\\u80a4\\u8d28\\u8f83\\u4e3a\\u7c97\\u7cd9\\u6cb9\\u817b\\uff0c\\u4e5f\\u5bb9\\u6613\\u957f\\u9752\\u6625\\u75d8\\u3002\\u4e0b\\u9762\\u5c0f\\u7f16\\u5c31\\u6765\\u7ed9\\u5927\\u5bb6\\u8bf4\\u8bf4\\u7537\\u6027\\u8377\\u5c14\\u8499\\u4e0e\\u9752\\u6625\\u75d8\\u7684\\u5173\\u7cfb\\uff0c\\u60f3\\u4e86\\u89e3\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"14032\",\"title\":\"\\u5982\\u4f55\\u5065\\u5eb7\\u5ef6\\u957f\\u592b\\u59bb\\u751f\\u6d3b\\u65f6\\u95f4\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:" +
                "\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUEKO630-109253.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=14032\",\"content\":\"\\u5982\\u4f55\\u5065\\u5eb7\\u5ef6\\u957f\\u592b\\u59bb\\u751f\\u6d3b\\u65f6\\u95f4\\uff08\\u4f9b\\u56fe\\/\\u6bcf\\u65e5\\u70ed\\u6587\\uff09\\n\\n\\u7537\\u4eba\\u8d8a\\u6218\\u8d8a\\u52c7\\u53ef\\u4ee5\\u6709\\u4e24\\u79cd\\u8868\\u73b0\\uff0c\\u4e00\\u662f\\u6301\\u7eed\\u65f6\\u95f4\\u957f\\uff0c\\u4e8c\\u662f\\u4e0d\\u5e94\\u671f\\u77ed\\u3002\\u4e0d\\u540c\\u7684\\u4eba\\u6709\\u4e0d\\u540c\\u7684\\u8868\\u73b0\\uff0c\\u4f60\\u5e94\\u8be5\\u6839\\u636e\\u81ea\\u5df1\\u7684\\u60c5\\u51b5\\u6765\\u51b3\\u5b9a\\u52a0\\u5f3a\\u81ea\\u5df1\\u7684\\u54ea\\u4e2a\\u65b9\\u9762\\u3002\\n1\\u3001\\u6ce8\\u91cd\\u524d\\u620f \\n\\u5982\\u679c\\u4f60\\u7684\\u6301\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"14033\",\"title\":\"\\u4f60\\u5403\\u7684\\u58ee\\u9633\\u98df\\u7269\\u4e0d\\u53ef\\u4fe1\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUEN00130-25260.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=14033\",\"content\":\"\\u201c\\u5403\\u5565\\u8865\\u5565\\u201d\\u4e00\\u76f4\\u662f\\u8bb8\\u591a\\u4eba\\u4fe1\\u5949\\u7684\\u4fdd\\u5065\\u6807\\u51c6\\uff0c\\u5403\\u5fc3\\u8865\\u5fc3\\u5403\\u809d\\u8865\\u809d\\uff0c\\u60f3\\u8981\\u58ee\\u9633\\u76ca\\u80be\\u5c31\\u72ec\\u7231\\u201c\\u5927\\u8170\\u5b50\\u201d\\u3002\\u7136\\u800c\\u8fd9\\u79cd\\u505a\\u6cd5\\u5b9e\\u9645\\u4e0a\\u662f\\u9519\\u7684\\uff0c\\u56e0\\u4e3a\\uff0c\\u52a8\\u7269\\u7684\\u5185\\u810f\\u542b\\u5927\\u91cf\\u91cd\\u91d1\\u5c5e\\uff0c\\u957f\\u671f\\u8fc7\\u91cf\\u98df\\u7528\\u4e0d\\u4ec5\\u4e0d\\u53ef\\u4ee5\\u58ee\\u9633\\uff0c\\u53cd\\u800c\\u4f1a" +
                "\\u5bfc\\u81f4\\u751f\\u6b96\\u80fd\\u529b\\u7684\\u51cf\\u9000\\u3002\\n\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"14034\",\"title\":\"\\u6bcf\\u5929\\u82b1\\u4e94\\u5206\\u949f\\u589e\\u5bff\\u4e8c\\u5341\\u5e74\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUEII4F-BV4.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=14034\",\"content\":\"\\u201c\\u5509\\uff0c\\u65e9\\u9910\\u4e00\\u70b9\\u80c3\\u53e3\\u4e5f\\u6ca1\\u6709!\\u201d\\u201c\\u54ce\\u54df\\uff0c\\u5feb\\u8fdf\\u5230\\u4e86!\\u201d\\u2026\\u2026\\u7d27\\u5f20\\u800c\\u5fd9\\u788c\\u7684\\u751f\\u6d3b\\uff0c\\u8ba9\\u5f88\\u591a\\u4eba\\u89c9\\u5f97\\u8eab\\u5fc3\\u75b2\\u60eb\\u3002\\u65f6\\u95f4\\u4e45\\u4e86\\uff0c\\u79cd\\u79cd\\u75be\\u75c5\\u4fbf\\u4f1a\\u627e\\u4e0a\\u95e8\\u6765\\u3002\\u5317\\u4eac\\u4e2d\\u533b\\u836f\\u5927\\u5b66\\u517b\\u751f\\u5ba4\\u6559\\u6388\\u5f20\\u6e56\\u5fb7\\u8350\\u8a00\\uff0c\\u5176\\u5b9e\\uff0c\\u4eba\\u4eec\\u53ea\\u8981\\u5b66\\u4f1a\\u5fd9\\u91cc\\u201c\\u5077\\u201d\\u95f2\\uff0c\\u6bcf\\u5929\\u62bd\\u51fa\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"14035\",\"title\":\"5\\u4ef6\\u4e8b\\u8ba9\\u4f60\\u65e9\\u887020\\u5e74\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUEJK620-WI5.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=14035\",\"content\":\"\\u7231\\u7f8e\\u662f\\u6bcf\\u4e2a\\u5973\\u6027\\u7684\\u5929\\u6027\\uff0c\\u8c01\\u90fd\\u4e0d\\u5e0c\\u671b\\u81ea\\u5df1\\u5149\\u6ed1\\u7684\\u8138\\u90e8\\u808c\\u80a4\\u4e0a\\u8fc7\\u65e9\\u7684\\u51fa\\u73b0\\u4e86\\u76b1\\u7eb9\\u3002\\u4fc4\\u7f57\\u65af\\u201c\\u533b\\u5b66\\u8bba\\u575b\\u201d\\u65b0\\u95fb\\u7f51\\u76d8\\u70b9\\u8138\\u90e8\\u8fc7\\u65e9\\u51fa\\u73b0\\u76b1\\u7eb9\\u76845\\u79cd\\u539f\\u56e0\\uff0c\\u5e2e\\u52a9\\u5973\\u6027\\u907f\\u514d\\u8138\\u90e8\\u95ee\\u9898\\uff0c\\u4fdd\\u6301\\u808c\\u80a4\\u5149\\u6ed1\\u3002\\n \\n5\\u4ef6\\u4e8b\\u8ba9\\u4f60\\u65e9\\u887020\\u5e74\\uff08\\u4f9b\\u56fe\\/\\u6bcf\\u65e5\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"14036\",\"title\":\"6\\u7537\\u5b50\\u4e70\\u5356\\u8c61\\u7259\\u7280\\u725b\\u89d2\\u7b49\\u53d7\\u5ba1 \\u6d89\\u6848\\u91d1\\u989d\\u8fd11600\\u4e07\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUC9445040-63X1.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=14036\",\"content\":\"\\u6ed5\\u67d0(\\u5de6\\u4e00)\\u7b49\\u4e" +
                "ba\\u51fa\\u5ead\\u53d7\\u5ba1\\u3002\\u4eac\\u534e\\u65f6\\u62a5\\u8bb0\\u8005\\u6b27\\u9633\\u6653\\u83f2\\u6444\\n\\n\\u539f\\u672c\\u7ecf\\u8425\\u5510\\u5361\\u3001\\u871c\\u8721\\u7684\\u6ed5\\u67d0\\u5728\\u5229\\u76ca\\u9a71\\u4f7f\\u4e0b\\uff0c\\u5f00\\u59cb\\u6536\\u8d2d\\u8c61\\u7259\\u3001\\u7280\\u725b\\u89d2\\u7b49\\u6fd2\\u5371\\u91ce\\u751f\\u52a8\\u7269\\u5236\\u54c1\\u3002\\u636e\\u68c0\\u65b9\\u6307\\u63a7\\uff0c\\u4ec5\\u6ed5\\u67d0\\u6536\\u8d2d\\u7684\\u8c61\\u7259\\u5c31\\u9ad8\\u8fbe500\\u4f59\\u516c\\u65a4\\uff0c\\u52a0\\u4e0a\\u4e70\\u5356\\u7684\\u7280\\u725b\\u89d2\\u3001\\u718a\\u638c\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15773\",\"title\":\"\\u822a\\u73ed\\u5ef6\\u8bef\\u6216\\u53d6\\u6d88\\u65f6\\uff0c\\u822a\\u7a7a\\u516c\\u53f8\\u201c\\u5927\\u8111\\u4e2d\\u67a2\\u201d\\u5728\\u505a\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUC9544110-Y543.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15773\",\"content\":\"\\u6df1\\u5733\\u590f\\u65e5\\u5929\\u6c14\\u591a\\u53d8\\uff0c\\u7ed9\\u6bcf\\u5929\\u7684\\u822a\\u73ed\\u8fd0\\u8f93\\u9020\\u6210\\u4e86\\u4e0d\\u5c0f\\u7684\\u56f0\\u6270\\uff0c\\u65c5\\u5ba2\\u5e38\\u5e38\\u4f1a\\u63a5\\u5230\\u822a\\u73ed\\u5ef6\\u8bef\\u6216\\u53d6\\u6d88\\u7684\\u901a\\u77e5\\u3002\\u822a\\u73ed\\u5230\\u5e95\\u662f\\u600e\\u6837\\u88ab\\u786e\\u5b9a\\u5ef6\\u8bef\\u6216\\u53d6\\u6d88\\u7684\\uff0c\\u822a\\u7a7a\\u516c\\u53f8\\u5bf9\\u6b64\\u5982\\u4f55\\u5e94\\u5bf9\\uff1f\\n\\u8bb0\\u8005\\u8d70\\u8fdb\\u5357\\u822a\\u6df1\\u5733\\u5206\\u516c\\u53f8\\u73b0\\u573a\\u8fd0\\u884c\\u4e2d\\u5fc3\\u4e00\\u63a2\\u7a76\\u7adf \\n \\n\\n\\u5357\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15774\",\"title\":\"\\u91cd\\u5e86\\u7da6\\u6c5f\\u73b0\\u65e5\\u6655 \\u5e02\\u6c11\\u56f4\\u5708\\u62cd\\u7167\\u7559\\u5ff5\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUCaD510-139135.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15774\",\"content\":\"7\\u67085\\u65e5\\uff0c\\u91cd\\u5e86\\u7da6\\u6c5f\\u533a\\u5929\\u7a7a\\u51fa\\u73b0\\u7f55\\u89c1\\u7684\\u65e5\\u6655\\u5947\\u89c2\\uff0c\\u5728\\u84dd\\u8272\\u7684\\u5929\\u7a7a\\u4e2d\\u592a\\u9633\\u88ab\\u4e00\\u4e2a\\u5de8\\u5927\\u7684\\u5f69\\u8272\\u5149\\u73af\\u5708\\u4f4f\\uff0c\\u7eda\\u4e3d\\u591a\\u59ff\\uff0c\\u5206\\u5916\\u58ee\\u89c2\\u3002\\u636e\\u5f53\\u5730\\u5e02\\u6c11\\u900f\\u9732\\uff0c\\u65e5\\u6655\\u5947\\u89c2\\u81ea\\u4e0a\\u534811\\u65f6\\u8bb8\\u5f00\\u59cb\\u51fa\\u73b0\\uff0c\\u4e00\\u76f4\\u5230\\u4e0b\\u534814\\u65f620\\u5206\\u7ed3\\u675f\\uff0c\\u6301\\u7eed\\u4e86\\u4e09\\u4e2a\\u5c0f\\u65f6\\u3002\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15775\",\"title\":\"\\u6816\\u6c34\\u51c9\\u4ead\\u7684\\u4e00\\u5468 \\u6298\\u5c04\\u4e00\\u4e2a\\u88ab\\u6df9\\u6ca1\\u7684\\u6b66\\u6c49\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUD0304020-W206.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15775\",\"content\":\"\\u6458\\u8981\\uff1a \\u8fd9\\u662f\\u6b66\\u6c49\\u6b66\\u660c\\u9ec4\\u82b1\\u77f6\\u4eb2\\u6c34\\u5e73\\u53f0\\u7684\\u4ead\\u5b50\\uff0c\\u4e09\\u5f20\\u56fe\\u5206\\u522b\\u62cd\\u6444\\u4e8e\\u662f6\\u670829\\u65e5\\uff0c7\\u67082\\u65e5\\uff0c7\\u67086\\u65e5\\uff0c\\u76f4\\u51fb\\u6b66\\u6c49\\u51c9\\u4ead\\u60e8\\u906d" +
                "\\u201c\\u6ca1\\u9876\\u4e4b\\u707e\\u201d\\u5168\\u8fc7\\u7a0b\\u3002\\n \\n\\u3010\\u6816\\u6c34\\u51c9\\u4ead\\u7684\\u4e00\\u5468 \\u6298\\u5c04\\u4e00\\u4e2a\\u88ab\\u6df9\\u6ca1\\u7684\\u6b66\\u6c49\\u3011\\u8fd9\\u662f\\u6b66\\u6c49\\u6b66\\u660c\\u9ec4\\u82b1\\u77f6\\u4eb2\\u6c34\\u5e73\\u53f0\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15776\",\"title\":\"\\u5317\\u4eac5\\u5e74\\u5185\\u843d\\u5b9e\\u5ef6\\u8fdf\\u9000\\u4f11\\u653f\\u7b56 \\u4eac\\u6d25\\u5180\\u533b\\u4fdd\\u5c06\\u4e92\\u8ba4\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUD052W0-2bE.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15776\",\"content\":\"\\u5907\\u53d7\\u5173\\u6ce8\\u7684\\u6e10\\u8fdb\\u5f0f\\u5ef6\\u8fdf\\u9000\\u4f11\\u653f\\u7b56\\u8981\\u5728\\u201c\\u5341\\u4e09\\u4e94\\u201d\\u65f6\\u671f\\u9010\\u6b65\\u843d\\u5b9e\\uff0c\\u5404\\u7c7b\\u53c2\\u4fdd\\u4eba\\u5458\\u7684\\u517b\\u8001\\u5f85\\u9047\\u5c06\\u5efa\\u7acb\\u6b63\\u5e38\\u8c03\\u6574\\u673a\\u5236\\uff0c\\u533b\\u4fdd\\u653f\\u7b56\\u5411\\u5927\\u75c5\\u548c\\u56f0\\u96be\\u4eba\\u7fa4\\u9002\\u5ea6\\u503e\\u659c\\u3002\\n \\n\\u5907\\u53d7\\u5173\\u6ce8\\u7684\\u6e10\\u8fdb\\u5f0f\\u5ef6\\u8fdf\\u9000\\u4f11\\u653f\\u7b56\\u8981\\u5728\\u201c\\u5341\\u4e09\\u4e94\\u201d\\u65f6\\u671f\\u9010\\u6b65\\u843d\\u5b9e\\uff0c\\u5404\\u7c7b\\u53c2\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15777\",\"title\":\"\\u6c5f\\u82cf\\u623f\\u4ea7\\u8001\\u603b\\u88ab\\u6355:10\\u591a\\u4ebf\\u6d41\\u5411\\u54ea\\u91cc\\uff1f\\u8fd8\\u80fd\\u8981\\u56de\\u6765\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUD062K60-493E.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15777\",\"content\":\"\\u6458\\u8981\\uff1a \\u53bb\\u5e742\\u6708\\uff0c\\u90e8\\u5206\\u503a\\u6743\\u4eba\\u5411\\u5357\\u4eac\\u8b66\\u65b9\\u62a5\\u6848\\uff0c\\u6839\\u636e\\u5f53\\u65f6\\u503a\\u6743\\u4eba\\u4eec\\u7684\\u7edf\\u8ba1\\uff0c\\u7eac\\u7eac\\u516c\\u53f8\\u5411\\u4ed6\\u4eba\\u53ca\\u5355\\u4f4d\\u501f\\u6b3e\\u8fbe8\\u4ebf\\u5de6\\u53f3\\uff0c\\u5411\\u94f6\\u884c\\u8d37\\u6b3e7\\u4ebf\\u5de6\\u53f3\\uff0c\\u6d89\\u53ca\\u503a\\u6743\\u4eba130\\u591a\\u4eba\\u3002\\n\\u5411\\u4ed6\\u4eba\\u53ca\\u5355\\u4f4d\\u8bb8\\u4ee5\\u9ad8\\u606f\\u501f\\u6b3e\\u3001\\u7528\\u516c\\u53f8\\u53ca\\u4ed6\\u4eba\\u623f\\u4ea7\\u5411\\u94f6\\u884c\\u62b5\\u62bc\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15778\",\"title\":\"\\u6df1\\u5733\\u5730\\u94c1\\u4e09\\u671f\\u4e8c\\u9636\\u6bb5\\u76fe\\u6784\\u59cb\\u53d1 6\\u53f7\\u7ebf\\u65bd\\u5de5\\u8fdb\\u5165\\u65b0\\u8d77\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUD0PbZ-V032.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15778\",\"content\":\"7\\u67086\\u65e5\\u4e0a\\u5348\\uff0c\\u5149\\u660e\\u65b0\\u533a\\u5730\\u94c16\\u53f7\\u7ebf\\u5357\\u5e84\\u7ad9\\u4e3e\\u884c\\u6df1\\u5733\\u5730\\u94c1\\u4e09\\u671f\\u4e8c\\u9636\\u6bb5\\u9996\\u53f0\\u76fe\\u6784\\u59cb\\u53d1\\u66a8\\u5de5\\u7a0b\\u5efa\\u8bbe\\u63a8\\u8fdb\\u8a93\\u5e08\\u5927\\u4f1a\\uff0c\\u8981\\u6c42\\u4fdd\\u8bc1\\u65bd\\u5de5\\u5b89\\u5168\\u8d28\\u91cf\\uff0c\\u4ee5\\u6700\\u9971\\u6ee1\\u7684\\u70ed\\u60c5\\u3001\\u6700\\u6602\\u626c\\u7684\\u6597\\u5fd7\\u52a0\\u5feb\\u6df1\\u5733\\u5730\\u94c16\\u53f7\\u7ebf\\u5efa\\u8bbe\\u8fdb\\u5ea6\\u3002\\n \\n\\u6df1\\u5733\\u65b0\\u95fb\\u7f51\\u5149\\u660e\\u8baf7\\u6708\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15779\",\"title\":\"\\u8fbd\\u5b81\\u672c\\u6eaa\\u7164\\u77ff\\u706b\\u707e13\\u4eba\\u88ab\\u56f0\\uff1a\\u5165\\u53e3\\u85cf\\u5728\\u66f4\\u8863\\u95f4\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUCcVQ0-29423.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15779\",\"content\":\"7\\u67084\\u65e5\\u51cc\\u66683\\u65f6\\u8bb8\\uff0c\\u8fbd\\u5b81\\u7701\\u672c\\u6eaa\\u5e02\\u6eaa\\u6e56\\u533a\\u5f69\\u5317\\u5730\\u533a\\u4e00\\u4e2a\\u975e\\u6cd5\\u76d7\\u91c7\\u7684\\u5c0f\\u7164\\u77ff\\u53d1\\u751f\\u706b\\u707e\\uff0c\\u9020\\u621013\\u540d\\u77ff\\u5de5\\u88ab\\u56f0\\u4e95\\u4e0b\\u3002\\u90dd\\u8d64\\u519b\\u4ecb\\u7ecd\\uff0c\\u6b63\\u5e38\\u77ff\\u4e95\\u5e94\\u8be5\\u81f3\\u5c11\\u6709\\u4e24\\u4e2a\\u4e95\\u53e3\\uff0c\\u4e00\\u4e2a\\u8fdb\\u51fa\\u77ff\\u5de5\\u3001\\u4e00\\u4e2a\\u8fd0\\u8f93\\u7164\\u70ad\\uff0c\\u4e0e\\u6b64\\u540c\\u65f6\\u4e00\\u4e2a\\u8fdb\\u98ce\\u3001\\u4e00\\u4e2a\\u51fa\\u98ce\\uff0c\\u8fd9\\u662f\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15780\",\"title\":\"\\u7537\\u5b50\\u5c06\\u503a\\u52a1\\u4eba\\u62c9\\u5230\\u575f\\u5730\\u5c06\\u5176\\u6252\\u5149 \\u79f0\\u4e0d\\u8fd8\\u94b1\\u5c31\\u6d3b\\u57cb\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUD01020P-44301.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15780\",\"content\":\"\\u897f\\u5b89\\u4e00\\u7537\\u5b50\\u4e3a\\u4e86\\u8ba8\\u8981\\u503a\\u52a1\\uff0c\\u7adf\\u7136\\u627e\\u4eba\\u5c06\\u503a\\u52a1\\u4eba\\u4ece\\u54b8\\u9633\\u5f3a\\u884c\\u62c9\\u5230\\u897f\\u5b89\\u4e00\\u5904\\u575f\\u5730\\uff0c\\u5c06\\u5176\\u8863\\u670d\\u6252\\u5149\\uff0c\\u7ed9\\u773c\\u775b\\u55b7\\u8fa3\\u6912\\u6c34\\uff0c\\u5e76\\u6bb4\\u6253\\u5a01\\u80c1\\uff1a\\u201c\\u5982\\u679c\\u4eca\\u5929\\u4e0d\\u8fd8\\u94b1\\uff0c\\u5c31\\u628a\\u4f60\\u6d3b\\u57cb\\u4e86\\u201d\\u3002\\n \\n\\u897f\\u5b89\\u4e00\\u7537\\u5b50\\u4e3a\\u4e86\\u8ba8\\u8981\\u503a\\u52a1\\uff0c\\u7adf\\u7136\\u627e\\u4eba\\u5c06\\u503a\\u52a1\\u4eba\\u4ece\\u54b8\\u9633\\u5f3a\\u884c\",\"date\":\"2016\\/07\\/11\"},{\"id\":\"15781\",\"title\":\"\\u4e0d\\u6c42\\u5f53\\u5927\\u5b98\\uff0c\\u53ea\\u6c42\\u591a\\u529e\\u4e8b\\uff08\\u6700\\u7f8e\\u57fa\\u5c42\\u5e72\\u90e8\\uff09\",\"category\":\"\\u9996\\u9875\",\"uri_img\":\"http:\\/\\/www.tiejiong.com\\/uploads\\/allimg\\/c160707\\/14CUD02051P-644X.jpg\",\"link\":\"http:\\/\\/114.215.239.59:8080\\/artical.php?id=15781\",\"content\":\"\\u4eca\\u5e743\\u670812\\u65e5\\uff0c\\u521a\\u521a\\u5378\\u4efb\\u5b89\\u5fbd\\u7701\\u6da1\\u9633\\u53bf\\u9ad8\\u516c\\u9547\\u515a\\u59d4\\u526f\\u4e66\\u8bb0\\u7684\\u5218\\u4e9a\\uff08\\u89c1\\u4e0a\\u56fe\\uff0c\\u8d44\\u6599\\u7167\\u7247\\uff09\\u56e0\\u52b3\\u7d2f\\u8fc7\\u5ea6\\u7a81\\u53d1\\u5fc3\\u810f\\u75c5\\u8f9e\\u4e16\\u3002\\u201d \\u9547\\u957f\\u5f20\\u5fc3\\u4e7e\\u662f\\u5218\\u4e9a\\u7684\\u9ad8\\u4e2d\\u540c\\u5b66\\uff0c\\u4ece\\u4e49\\u95e8\\u9547\\u5230\\u9ad8\\u516c\\u9547\\uff0c\\u4ed6\\u548c\\u5218\\u4e9a\\u4e00\\u8d77\\u5171\\u4e8b\\u4e869\\u5e74\\u3002\\n \\n\\u4eca\\u5e743\\u670812\\u65e5\\uff0c\",\"date\":\"2016\\/07\\/11\"}]}";
        Gson gson = new Gson();
        HashMap<String, Object> map = gson.fromJson(data, HashMap.class);
        int size = (int) (double) map.get("size");
        ArrayList<Map<String, Object>> news_list = (ArrayList<Map<String, Object>>) map.get("doc");
        for (int i = 0; i < news_list.size(); i++) {
            Map<String, Object> news = news_list.get(i);
            Iterator<Map.Entry<String, Object>> iterator = news.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> entry = iterator.next();
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }
}