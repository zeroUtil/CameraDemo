package com.util.camera;

import java.io.File;

/**
 * @author Created by  on 2020/11/25
 * 常量
 */
public class Constant {

    public static final String APP_NAME = "camera";
    //跨平台“No such file or diretory”异常
    public static final String BASE_PATH = APP_NAME + File.separator;
    //路径
    public static final String PATH_ROOT = FileUtils.getPath() + File.separator + Constant.BASE_PATH;


    public static final int CANCEL = 0;//取消
    public static final int CAMERA = 1;//拍照
    public static final int ALBUM = 2;//相册

}
