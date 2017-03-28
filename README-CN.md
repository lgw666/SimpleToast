# SimpleToast
 * 简单Toast, 解决了多次弹出时存在时间重叠问题。
 * 作者： 罗国文 邮箱:<a href="#">luoguowen123@qq.com</a>

  
      ![image](https://github.com/lgw666/SimpleToast/blob/master/SimpleToastDemo.gif)
 
 * ### 设置

   Step 1. 添加JitPack到你的Project的build.gradle:
            
             allprojects {
                    		repositories {
                    			...
                    			maven { url 'https://jitpack.io' }
                    		}
                    	}
                    	
   Step 2.  添加依赖：
   
             dependencies {
             	         compile 'com.github.lgw666:SimpleToast:v1.0'
             	}
              
 * ### 使用方法

   简单显示:

   `SimpleToast.show(Context,Msg);`

   
 * ### 参数

   使用的Context对象
 
   ```
   Context context;
   ```
   
   要显示的消息
   
   ```
   String msg;
   ```
 
 * ### 其他方法
 
   static void cancelCurrentToast(); 关闭当前显示的Toast
