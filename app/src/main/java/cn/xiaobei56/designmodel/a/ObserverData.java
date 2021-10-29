package cn.xiaobei56.designmodel.a;

import java.util.List;

/**
 * Project Name: DesignModel
 * Package Name: cn.xiaobei56.designmodel.a
 * Author: bzb
 * Date: 2021/10/29
 * Description:
 */
public class ObserverData {
   public ObserverData(String key, List<String> values) {
      this.key = key;
      this.values = values;
   }

   public String key;
   public List<String> values;

}
