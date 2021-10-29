package cn.xiaobei56.designmodel.a.observers;

import cn.xiaobei56.designmodel.a.BObserver;
import cn.xiaobei56.designmodel.a.ObserverData;

/**
 * Project Name: DesignModel
 * Package Name: cn.xiaobei56.designmodel.a.observers
 * Author: bzb
 * Date: 2021/10/29
 * Description:  观察者 B
 */
public class RealBObserver implements BObserver {

    @Override
    public void update(ObserverData value) {
        System.out.println("观察者B： "+value.key);
    }
}
