package website.lizihanglove.designpattern.patterns.kotlin.singleton


/**
 * @author lizihanglove
 * @date  2018/1/26
 * @email one_mighty@163.com
 * @desc 单例模式
 */
object Singleton {
    fun print(){
        println("Singleton ${this.javaClass.hashCode()}");
    }
}