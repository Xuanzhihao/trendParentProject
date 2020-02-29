package cn.trend.service;

import cn.trend.client.IndexDataClient;
import cn.trend.pojo.IndexData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BackTestService {
    @Autowired
    IndexDataClient indexDataClient;

    public List<IndexData> listIndexData(String code){
        List<IndexData> result = indexDataClient.getIndexData(code);
        Collections.reverse(result);

//        for (IndexData indexData : result) {
//            System.out.println(indexData.getDate());
//        }

        return result;
    }
}
