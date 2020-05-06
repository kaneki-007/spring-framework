/**
 * Generic abstraction for (file-based) resources, used throughout the framework.
 */
package org.springframework.core.io;


//1、Spring 提供了 Resource 和 ResourceLoader 来统一抽象整个资源及其定位。使得资源与资源的定位有了一个更加清晰的界限，
//并且提供了合适的 Default 类，使得自定义实现更加方便和清晰。
//2、AbstractResource 为 Resource 的默认实现，它对 Resource 接口做了一个统一的实现，子类继承该类后只需要覆盖相应的方法即可，
//		同时对于自定义的 Resource 我们也是继承该类。
//3、DefaultResourceLoader 同样也是 ResourceLoader 的默认实现，在自定 ResourceLoader 的时候我们除了可以继承该类外还可以实现 ProtocolResolver 接口来实现自定资源加载协议。
//4、DefaultResourceLoader 每次只能返回单一的资源，所以 Spring 针对这个提供了另外一个接口 ResourcePatternResolver ，
//		该接口提供了根据指定的 locationPattern 返回多个资源的策略。其子类 PathMatchingResourcePatternResolver 是一个集大成者的 ResourceLoader ，
//		因为它即实现了 Resource getResource(String location) 也实现了 Resource[] getResources(String locationPattern)。
