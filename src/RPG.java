
/*
* 想象下你正在运营一个桌面RPG，你的玩家们正在创建角色。
每个角色都有六个核心属性:力量、敏捷、体格、智力、学识和魅力。
为这些属性生成值的一种方法是掷四个六面骰子，并将其中三个最高的骰子相加，丢弃最低的骰子。
有些玩家喜欢按滚动的顺序为属性赋值。
为了确保生成的角色不会让玩家处于劣势，必须满足以下要求:
所有字符属性的总和必须至少为75。
至少两个属性必须至少为15。
这需要多次"掷骰子"，所以用程序解决方案会快得多。
任务：编写一个程序:
1、生成4个1和6之间的随机整数值。
2、保存其中3个最大值的和。
3、通过这种方式总共生成6个值。
4、显示完成后的总数和所有6个值。
要求：
1、必须保留生成每个值的顺序。
2、所有6个值的总和必须至少为75。
3、其中至少有两个值必须大于或等于15。
* */

import java.util.*;

public class RPG {
    public static void main(String[] args) {
        ArrayList<Integer> attribute = new ArrayList<>();
        int sum1 = 0;
        int count = 0;
        int all = 0;
        //生成6个属性值
        while (attribute.size() < 6 && sum1 <75 ){
            int temp = generateAttribute();
            if (count > 1 || temp > 14) {
                attribute.add(temp);
                sum1 += temp;
                count += 1;
            }else {continue;}

        }

        for (int i : attribute){
            all += i;
            System.out.println(i);
        }
        System.out.println("总数： "+all);

    }


        //生成4个1和6之间的随机整数值，保存其中3个最大值的和。
    public static int generateAttribute(){
        int[] numArray = new int[4];
        Random random = new Random();
        for (int i = 0;i<4;i++){
            int num = random.nextInt(6)+1;
            numArray[i] = num;
        }
        Arrays.sort(numArray);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : numArray){
            arrayList.add(i);
        }
        arrayList.remove(0);
        int sum = 0;
        for (int i : arrayList){
            sum += i;

        }
        return sum;

    }



}
