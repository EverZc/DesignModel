package com.zc.factory.Demo;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public class NOKIAPhoneFactor extends NokiaFactory {
    @Override
    public <T extends NokiaPhone> T createNOKIAPhone(Class<T> clas) {
        NokiaPhone phone=null;
        try {
            phone= (NokiaPhone) Class.forName(clas.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) phone;
    }
}
