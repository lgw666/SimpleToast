# SimpleToast
 * A simple toast, avoid the overlap of the existence of toast for multiple clicks.
 * Author： Luo Guowen Email:<a href="#">luoguowen123@qq.com</a>

  
      ![image](https://github.com/lgw666/SimpleToast/blob/master/SimpleToastDemo.gif)
 
 * ### Setup

   Step 1. Add the JitPack repository to your build file Add it in your root build.gradle at the end of repositories:
            
             allprojects {
                    		repositories {
                    			...
                    			maven { url 'https://jitpack.io' }
                    		}
                    	}
                    	
   Step 2. Add the dependency：
   
             dependencies {
             	         compile 'com.github.lgw666:SimpleToast:v1.0'
             	}
              
 * ### Usage

   Simple show :

   `SimpleToast.show(Context,Msg);`

   
 * ### Params

   The context to use.
 
   ```
   Context context;
   ```
   
   The message to show.
   
   ```
   String msg;
   ```
 
 * ### Other methods
 
   static void cancelCurrentToast(); Cancel the current toast.
