package org.taru.api.four;

import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.taru.service.four.PraiseService;
import org.taru.vo.JsonResult;

import javax.servlet.http.HttpSession;
/*
点赞功能的实现，点击按钮实现点赞的数量加一
 */
@Controller
@CrossOrigin//实现跨域
public class PraiseApi {

    @Autowired
    PraiseService praise;
    @RequestMapping("/api/PraiseApi")//点赞接口
    @ResponseBody
    public JsonResult updatapassword(@RequestParam("homeid") int homeid, HttpSession session) {

        JsonResult result = null;
        try {
            int p = praise.praiseservice(homeid);


            if (p == 0) {
                result = new JsonResult("404", "点赞失败", "gdf");
            } else {
                result = new JsonResult("200", "点赞成功",p);
                session.setAttribute("selectsuccess",p);

            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult("500", "异常", "jfs");
        }
        return result;
    }
}
