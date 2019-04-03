package com.arcsoft.arcfacedemo.util;

import android.text.TextUtils;

import java.io.File;

public class Delete {


    public  static void deleteFolderFile(String filePath, boolean deleteThisPath) {
        if (!TextUtils.isEmpty(filePath)) {
            try {
                File file = new File(filePath);
                if (file.isDirectory()) {// 处理目录
                    File files[] = file.listFiles();
                    for (int i = 0; i < files.length; i++) {
                        deleteFolderFile(files[i].getAbsolutePath(), true);
                    }
                  //  file.delete();
                }else if (file.exists()) {
                    file.delete();
                }
//                    if (deleteThisPath) {
//                        if (!file.isDirectory()) {// 如果是文件，删除
//                            file.delete();
//                        } else {// 目录
//                            if (file.listFiles().length == 0) {// 目录下没有文件或者目录，删除
//                                file.delete();
//                            }
//                        }
//                    }


            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }



}
