package cn.xiaobei56.designmodel;

import java.util.ArrayList;

import cn.xiaobei56.designmodel.a.ObserverData;
import cn.xiaobei56.designmodel.a.RealObservable;
import cn.xiaobei56.designmodel.a.observers.RealAObserver;
import cn.xiaobei56.designmodel.a.observers.RealBObserver;
import cn.xiaobei56.designmodel.a.observers.RealCObserver;

/**
 * Project Name: DesignModel
 * Package Name: cn.xiaobei56.designmodel.a
 * Author: bzb
 * Date: 2021/10/29
 * Description:  主函数
 */
public class JavaMain {
    public static void main(String[] args) {
        RealObservable realObservable = new RealObservable();
        realObservable.registerObserver(new RealAObserver());
        realObservable.registerObserver(new RealBObserver());
        realObservable.registerObserver(new RealCObserver());
        ObserverData observerData = new ObserverData("key", new ArrayList<>());
        realObservable.updateData(observerData);
    }

}
