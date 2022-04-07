//创建一个可以执行动画的函数
/*
    参数：
        obj：执行动画的对象
        attr：修改的样式    可传left、top、width、height
        traget：移动的目标
        speed：移动速度
        callback：回调函数，动画执行完毕后调用

*/
function move(obj, attr, target, speed, callback) {
    //关闭同一对象的上一个定时器
    clearInterval(obj.timer);
    //获取当前信息（位置或大小）
    var current = parseInt(getComputedStyle(obj, null)[attr]);
    //如果当前信息相比目标小了，就不改变speed，如果当前信息相比目标大了，就将speed变为负
    if (current > target) {
        speed = -speed;
    }
    //给对象添加timer属性，用来作为定时器的标识
    obj.timer = setInterval(function () {
        //获取当前信息（位置或大小）
        current = parseInt(getComputedStyle(obj, null)[attr]);
        var newCurrent = current + speed;
        if ((speed > 0 && newCurrent > target) || (speed < 0 && newCurrent < target)) {
            newCurrent = target;
        }
        obj.style[attr] = newCurrent + "px";
        if (newCurrent == target) {
            clearInterval(obj.timer);
            // callback && callback(box2,"height",300,10);
            callback && callback();
        }
    }, 30);
}

/*
     hasClass(obj,cn)    用来判断obj中有无cn这个class
*/
function hasClass(obj, cn) {
    //创建一个正则表达式
    var reg = new RegExp("\\b" + cn + "\\b");
    return reg.test(obj.className);
}
/*
    addClass(obj,cn)    用来将cn加入到obj的class属性中
        参数：  obj：操作的元素
                cn：class值
*/
function addClass(obj, cn) {
    if (!hasClass(obj, cn)) {
        obj.className += " " + cn;
    }
}
/*
    removeClass(obj,cn) 用来删除obj中的cn
*/
function removeClass(obj, cn) {
    var reg = new RegExp("\\b" + cn + "\\b");
    obj.className = obj.className.replace(reg, "");
}
/*
    toggleClass(obj,cn) 用来切换一个类，如果元素中有该类，则删除，如果没有，则添加
*/
function toggleClass(obj, cn) {
    if (hasClass(obj, cn)) {
        removeClass(obj, cn);
    } else {
        addClass(obj, cn);
    }
}