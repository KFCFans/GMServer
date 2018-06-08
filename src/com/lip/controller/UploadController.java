package com.lip.controller;

import com.lip.pojo.result.RequestResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
@RequestMapping("/upload")
public class UploadController {

    // 上传活动图片
    @RequestMapping("/activity")
    @ResponseBody
    public String uploadActivityLogo(@RequestParam("file") CommonsMultipartFile file){

        //文件名
        String filename = Long.toString(System.currentTimeMillis());
        String path = "D:\\GraduationProject\\GMResource\\activity";

        try {
            uploadFile(filename,path,file);
        } catch (Exception e) {
            return e.getMessage();
        }
        return filename;
    }

    // 上传任务图片
    @RequestMapping("/task")
    @ResponseBody
    public String uploadTaskLogo(@RequestParam("file") CommonsMultipartFile file){

        //文件名
        String filename = Long.toString(System.currentTimeMillis());
        String path = "D:\\GraduationProject\\GMResource\\task";

        try {
            uploadFile(filename,path,file);
        } catch (Exception e) {
            return e.getMessage();
        }
        return filename;
    }

    // 上传植物图片
    @RequestMapping("/plant")
    @ResponseBody
    public String uploadPlantInfo(@RequestParam("file") CommonsMultipartFile file){

        //文件名
        String filename = Long.toString(System.currentTimeMillis());
        String path = "D:\\GraduationProject\\GMResource\\plant";

        try {
            uploadFile(filename,path,file);
        } catch (Exception e) {
            return e.getMessage();
        }
        return filename;
    }

    // 上传反馈图片
    @RequestMapping("/response")
    @ResponseBody
    public String uploadResponsePic(@RequestParam("file") CommonsMultipartFile file){

        //文件名
        String filename = Long.toString(System.currentTimeMillis());
        String path = "D:\\GraduationProject\\GMResource\\response";

        try {
            uploadFile(filename,path,file);
        } catch (Exception e) {
            return e.getMessage();
        }
        return filename;
    }

    // 保存文件方法
    void uploadFile(String filename,String path,CommonsMultipartFile file) throws Exception{

        InputStream is = file.getInputStream();
        OutputStream os = new FileOutputStream(new File(path,filename));
        int len=0;
        byte[] buffer = new byte[400];
        while ((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
    }

}
