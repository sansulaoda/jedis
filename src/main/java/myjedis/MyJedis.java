package myjedis;

import java.util.Set;

import redis.clients.jedis.Jedis;


public class MyJedis {
	
	public static void main(String[] args) throws InterruptedException {
		Jedis jedis = null;
		jedis = new Jedis("192.168.1.101",6379);
		//jedis.set("k1", "v1");
		//jedis.lpush("k2","l1","l2","l3");
		//jedis.rpush("k3", "r1","r2","r3");
		Set keys = jedis.keys("*");
		for (Object string : keys) {
			System.out.println(string);
		}
		Thread.sleep(100);
		System.out.println("于海东是个逗比！！！哈哈！！")
	}
}
