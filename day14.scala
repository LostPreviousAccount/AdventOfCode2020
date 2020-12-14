// https://scastie.scala-lang.org/

object Day14 extends App {
    val ex1 = """mask = XXXXXXXXXXXXXXXXXXXXXXXXXXXXX1XXXX0X
mem[8] = 11
mem[7] = 101
mem[8] = 0"""
    val ex2 = """mask = 000000000000000000000000000000X1001X
mem[42] = 100
mask = 00000000000000000000000000000000X0XX
mem[26] = 1"""
    val input = """mask = 0X10110X1001000X10X00X01000X01X01101
mem[49559] = 97
mem[18692] = 494387917
mem[9337] = 615452
mem[24695] = 3435491
mem[54748] = 10952137
mem[26017] = 32712432
mask = 00XX1111100100XX1000X1X00001111X1010
mem[16422] = 941878948
mem[15811] = 1427982
mem[55941] = 1648468
mem[50262] = 34782
mask = 0X1XX0101X000X01X00010101010X01010XX
mem[31936] = 68499492
mem[47668] = 114724
mem[57586] = 8657
mask = 00X011X1000101X1X00100010100111X010X
mem[46399] = 6265852
mem[36602] = 12552
mem[17808] = 480766447
mask = 0010X1101XX1000010000101XX0X0111XXX0
mem[61550] = 2144
mem[12310] = 8434
mem[46270] = 620776688
mask = 00X010X1101000011X0010110000000111X0
mem[18707] = 924
mem[32247] = 5390
mem[21834] = 7889379
mem[38792] = 1172396
mask = 0010011110X10000100010001001X0X1010X
mem[45516] = 247297103
mem[12328] = 47121
mem[53356] = 313972398
mem[32321] = 54327
mem[51090] = 872
mem[17132] = 195738
mask = 00X0111X11X1000000000X11001110110000
mem[25163] = 172058004
mem[15187] = 242259364
mem[55892] = 208014
mem[54180] = 1075108
mem[15383] = 155948
mem[58739] = 451738
mask = X0101011X0010000100X11000XX1101XX101
mem[27725] = 2381032
mem[35592] = 631531
mem[40785] = 6448
mem[29521] = 62144
mem[29440] = 903363
mask = 00X0011101X10X0010010100001X001XX011
mem[24151] = 1765762
mem[21857] = 7918
mem[63018] = 6575380
mask = 0110XX111X011000000011X101X11101011X
mem[65442] = 28047
mem[25670] = 3029
mem[57006] = 1565313
mem[20847] = 985508835
mem[863] = 16173
mem[49800] = 1899312
mask = 0010111010110001101X1XX0000X01111100
mem[21461] = 1581
mem[6284] = 4257
mem[4190] = 3144656
mem[3463] = 468415
mask = 10101X1XX00100X0100101001X0X00X10000
mem[26762] = 24445336
mem[36112] = 870
mem[29286] = 6791
mem[3623] = 122623922
mem[37829] = 1003974
mem[25459] = 4055897
mem[64097] = 1064623826
mask = 00101X110001000010X001001011101XX001
mem[14303] = 311
mem[13975] = 12720
mem[14332] = 1300
mem[38213] = 297730401
mem[27725] = 237
mask = X010X0110001000010000001001010XX0100
mem[20190] = 1272
mem[46270] = 221128856
mem[55785] = 5980909
mask = 0XX0110010110001X1011X1011X101X1X001
mem[9144] = 144302
mem[10842] = 1570
mem[16570] = 380024535
mem[24818] = 15046
mem[18432] = 138559
mask = 11101111X1X01010X001X10X010XX11001XX
mem[2544] = 4751
mem[33164] = 115778
mem[7248] = 27222279
mem[22876] = 13564062
mem[1864] = 25837
mem[58257] = 12213685
mask = 0110X11XX10100X000000100001001X011X0
mem[12584] = 2024522
mem[6210] = 8229
mem[8766] = 8185
mem[51618] = 267
mem[8626] = 7719
mask = 0010X111X001000X100001X00X01111010X1
mem[23503] = 15526
mem[44791] = 330945100
mem[5384] = 33240145
mask = 01100110110101XXX001011X0100011X1X10
mem[21668] = 115788555
mem[37829] = 62403341
mem[12316] = 6381647
mem[187] = 56011889
mem[28726] = 198678
mask = 0X1X0110110101000010010011X0000X011X
mem[57554] = 807
mem[14745] = 2599933
mem[30452] = 652
mem[56471] = 824
mem[155] = 107800
mask = 01111X11100100XXX0X10100011010X01111
mem[17534] = 83331
mem[12328] = 21566
mem[64079] = 777617
mask = 00X0101010XX0101X0001110100001X1X010
mem[49740] = 3678043
mem[59944] = 2152703
mem[15347] = 540
mem[43065] = 8750
mem[59436] = 1007
mem[34026] = 3739658
mem[36292] = 12408565
mask = X0101XX10001X00010010101100010010100
mem[52717] = 322897
mem[42104] = 109043
mem[27710] = 3969
mem[14303] = 33330965
mem[33456] = 304172
mask = 1X10XX1100010X00100XX100101X0010X1X1
mem[4244] = 20175818
mem[61478] = 200
mem[61686] = 15970366
mem[16124] = 851
mem[50049] = 4167991
mem[36636] = 4096
mask = 0X10001X1X00010X10000000100001111000
mem[57968] = 624
mem[63941] = 2929102
mem[7754] = 1871
mem[11323] = 206920245
mask = 000011101X0X00100001101010111010XXXX
mem[31626] = 670
mem[15181] = 59456338
mem[55713] = 1676222
mem[56359] = 20412
mem[25175] = 1293
mask = X01XX0X0101X01X1001100010000XX100110
mem[21695] = 25826241
mem[8492] = 217793
mem[6413] = 149375
mem[57286] = 908076
mem[18046] = 1043868
mask = 0X1X1XX0X0101001100000X001000110X001
mem[15424] = 7476
mem[32081] = 691
mem[33412] = 2077682
mem[50262] = 13476494
mem[35776] = 6966
mask = 001X011011010X0000X0010X000X10X01001
mem[16801] = 308748595
mem[23991] = 1594268
mem[21953] = 3476
mask = 00101XX010X1XX0X10000X00011001001100
mem[3914] = 3697822
mem[30282] = 165849
mask = 0X1011XX10X1000X100X0100000X0110X01X
mem[20936] = 1804131
mem[12310] = 493067074
mem[5278] = 1477
mem[22529] = 24739113
mem[13837] = 629
mem[36163] = 164223
mask = 0000X01X1X1X001010X00XX0X11010110000
mem[34846] = 4013
mem[64595] = 2652052
mem[58536] = 14615
mem[6140] = 354
mem[53462] = 8830
mem[28484] = 980
mask = 001X001X110XX1011000XX0X1010X1100000
mem[40674] = 504944077
mem[17422] = 26612806
mem[59640] = 57480769
mem[18637] = 14497350
mem[59899] = 14488383
mask = X01011001X1100X11X0001110X0001101010
mem[19874] = 833
mem[59803] = 33570030
mem[63132] = 4033082
mem[8953] = 10579034
mem[53684] = 69083
mask = 101XX11000X1000X100X010X1001X00X1010
mem[20892] = 22441
mem[21362] = 1543
mem[9748] = 828
mem[49630] = 1390233
mem[8320] = 153009589
mem[55478] = 15482525
mask = 101001101X110XXX1X00X11010X110100100
mem[55883] = 46604963
mem[18695] = 865462
mem[63730] = 18524689
mem[61940] = 54457
mask = 0X101010101100XX00001X10X0X001100X1X
mem[21135] = 1416
mem[41271] = 297563369
mem[2801] = 438736658
mem[33417] = 104296019
mem[12218] = 2327714
mem[56582] = 100
mem[4210] = 28138615
mask = X1101XXX1X0XX00000000010001000011111
mem[629] = 50231
mem[32873] = 1126
mask = 1010101X10X1000010011010X010X1100001
mem[57773] = 672368219
mem[7754] = 224
mask = 001X0X1010X0010X00XXX00X001000101X01
mem[65129] = 26886
mem[2407] = 553
mem[22912] = 618
mem[60238] = 394015
mem[24479] = 15346125
mem[44271] = 963731
mem[3448] = 614
mask = X00XX11X010X00001XX1010101000110XX11
mem[42389] = 274217874
mem[5874] = 38269
mem[58419] = 1250
mem[44987] = 49398
mem[5632] = 142572
mask = 00XX1101111X10000000110101XX01111010
mem[34938] = 4156802
mem[15849] = 2431
mem[7719] = 264899
mem[47322] = 1923
mem[53582] = 1049303215
mem[61672] = 5433360
mask = 01X00110110X0100100X011001X001011000
mem[22759] = 66453
mem[131] = 35215085
mem[12318] = 3438
mem[54214] = 2447
mem[20586] = 13447799
mem[36901] = 6594
mem[63774] = 161290
mask = 1X100110101101011X001001001X11X10000
mem[11229] = 610680
mem[54493] = 178935
mem[59828] = 187077978
mem[18695] = 634879209
mem[31774] = 260156127
mask = X1101X01X0110X0X10010100100001000011
mem[5384] = 55089052
mem[56707] = 1199
mem[6241] = 167085
mem[35229] = 270633429
mask = X010X110111100001XX0111110XX10100100
mem[16466] = 94827
mem[22912] = 15840
mem[55941] = 5279
mem[3776] = 956567
mem[2548] = 423456
mask = 00101X1X10XX000XX0000X00X000X1100010
mem[318] = 4564
mem[63730] = 166041231
mem[22594] = 31976
mem[63132] = 372667688
mask = 00X01XX111X0XX000X00010100001X1X0000
mem[62554] = 3782
mem[23515] = 1020
mem[61478] = 1989395
mem[8202] = 336
mem[51133] = 24196
mask = 00X011101X0X0000100000X1010X10110100
mem[57403] = 1006178
mem[38792] = 195226128
mem[22876] = 586
mem[12681] = 455317
mem[17511] = 12380886
mem[49169] = 249614392
mask = XX1XX110110X0X001X0001110001011XX000
mem[24944] = 7880
mem[52801] = 548206
mem[40297] = 1842
mask = 10100X10110101000001XX01X000101010X0
mem[47703] = 142961
mem[24714] = 21643314
mem[47738] = 981
mem[53881] = 235725
mem[57200] = 3065
mem[7057] = 411383
mask = 00101X1X1X0X0000X0000111X0XX000100X0
mem[13084] = 1220241
mem[55478] = 1756550
mem[51425] = 16272
mem[16480] = 50
mask = 0010X1010101010X1X01000X0XX0X1111100
mem[47738] = 489811
mem[49510] = 506468324
mem[42647] = 254966
mem[21983] = 177334947
mem[57934] = 17164
mem[20975] = 31773
mask = 00X010111X10001X10X01X0001X00X011110
mem[24329] = 2836705
mem[10924] = 33441
mem[16570] = 12842
mem[48160] = 31658345
mem[39271] = 125879
mem[57582] = 7894
mem[11450] = 1175
mask = 0010111X111X0X001XX001110101XX010100
mem[61777] = 56579303
mem[33355] = 448
mem[33312] = 1519308
mem[13410] = 139808
mask = X0101101XX010X0X100100010XX1110000X0
mem[17524] = 220
mem[59081] = 15576
mem[53881] = 26754171
mem[61759] = 759107875
mem[44955] = 1095338
mask = 00XX111X1001X00XX00X0101011001X01010
mem[25698] = 129940664
mem[44770] = 6979978
mem[64588] = 5889315
mem[40785] = 1521223
mem[13412] = 5363
mask = 0X1X111X10010XXXX00X01000100100X0011
mem[24954] = 232419
mem[36911] = 1013
mem[748] = 3477894
mem[52502] = 17757
mask = 0110XX111101X0XX00000X1X00X00110111X
mem[21852] = 280
mem[63272] = 137
mem[12318] = 1572
mem[55288] = 395513725
mask = 001010X11XX0X0X110X0101110XX0X011110
mem[63028] = 492
mem[9276] = 33096812
mem[25175] = 3379185
mem[2506] = 116264647
mask = 00001110100110010000011XX10001X01X0X
mem[6255] = 61174770
mem[7621] = 671316
mem[20594] = 71376
mem[4682] = 30696
mem[65022] = 454693145
mem[2833] = 7724
mask = 0X1X11101010XX01100000100000X110X000
mem[26032] = 6287
mem[38028] = 2931
mem[36901] = 74240381
mem[61490] = 32403
mem[7169] = 381190059
mask = 011011111X0X1011000XX010010101101011
mem[62413] = 552296904
mem[20936] = 5246710
mem[45070] = 331447320
mask = 11X011X11X01X0100X0100X0101101101100
mem[6765] = 72406007
mem[13881] = 4510
mem[8626] = 59791
mem[31029] = 292242652
mem[33810] = 1174065
mem[8926] = 136022413
mem[48007] = 2206
mask = 0X101X110001000X1000100110111X001001
mem[20827] = 6450574
mem[51354] = 465
mem[34643] = 315776316
mem[55288] = 120573300
mem[24044] = 867
mem[41271] = 35901083
mask = 011X11011001XX00100000X0X001010X00X0
mem[64472] = 614
mem[27725] = 50554
mem[20963] = 1913836
mask = 000011X0100100XX000111111X1000001010
mem[11384] = 24391
mem[40256] = 3112
mem[58467] = 945
mem[49324] = 43291236
mem[34214] = 110593321
mem[36058] = 553442
mem[53860] = 369
mask = 11X001111101101000100100X01X0110101X
mem[10842] = 1644
mem[30214] = 667815
mem[59082] = 235259777
mask = 00100110X1010000XX0X0101011100X01001
mem[21610] = 13407
mem[61463] = 32203
mem[14332] = 2946323
mem[25459] = 266755
mem[43193] = 543978
mask = 111X111111101X1010011X01010001X01100
mem[3370] = 6701920
mem[35024] = 1192
mem[21298] = 1909
mem[7944] = 249852721
mem[8492] = 204228278
mem[40639] = 6759164
mem[49355] = 2840103
mask = X01011001XX1X00010X100X1010X11X1101X
mem[15295] = 585163
mem[40143] = 7146744
mem[16598] = 562
mem[37619] = 26279
mem[13039] = 335
mem[30328] = 45887
mask = 00101011111X00111010X0011X010111XX11
mem[39184] = 4747
mem[55825] = 11117
mem[55349] = 92849344
mem[53005] = 304077
mem[65336] = 3286416
mem[46519] = 7411
mask = 0X1011001X1100011X0XX10X01X0011X101X
mem[31667] = 314416
mem[35944] = 61589
mask = 10101011X00100X010X1X11010110000X001
mem[16466] = 39912049
mem[60821] = 1786303
mem[60461] = 131749
mem[36058] = 15997725
mask = 0X10101110000001000000000X0011X00X00
mem[22626] = 1898101
mem[59348] = 830616413
mem[40830] = 618087839
mask = X010101010110X0100X1X1010100X100X11X
mem[116] = 833981
mem[48965] = 1260
mem[59467] = 84629
mem[40297] = 8614
mem[9270] = 18441
mem[22571] = 57264309
mask = 101X10X100010000100011011XX1X1101001
mem[40777] = 156
mem[16844] = 2818
mem[13118] = 55551237
mem[7507] = 1693
mem[29987] = 255647
mask = 01100XX1110X10XX0000111000X00X101100
mem[24227] = 455643
mem[54808] = 53217219
mem[21852] = 840321991
mem[18282] = 3771
mask = 011010XX101X00XX000011X110X001100100
mem[47693] = 7235
mem[24676] = 1289
mem[7893] = 290965
mem[36674] = 755
mask = 001011010X0101011X0XXX11X1XX11001X11
mem[27511] = 10086485
mem[24695] = 18526
mem[37129] = 82647894
mem[21074] = 658
mem[23185] = 949594
mem[21822] = 277
mask = 0X10011XXX010X00X00X01010X0001101000
mem[28734] = 7791007
mem[16801] = 69135
mem[22283] = 70519497
mask = 01100011110X0000000000100X110X10001X
mem[26142] = 450696
mem[5278] = 1973
mem[40065] = 14006024
mem[51316] = 12998
mem[23515] = 9106885
mask = 0X1010X1X11010111X1011101X1X001X10X0
mem[4294] = 2754
mem[5182] = 548
mem[55139] = 33925678
mem[9276] = 16164
mem[18371] = 218847938
mem[59397] = 321268479
mem[26246] = 390
mask = 00X01110XXX1000X0111X001000X01110X10
mem[58490] = 3370
mem[64837] = 107867753
mem[3463] = 3921
mem[60264] = 527253
mem[53390] = 779
mem[56506] = 452
mask = X0101110111000X011X001110001000000XX
mem[43193] = 124146
mem[61880] = 686058
mem[49230] = 7782
mem[42389] = 161628247
mem[60208] = 367636850
mem[51719] = 680
mem[21043] = 13775468
mask = X0101X1010110001XXX101X10X0001000X10
mem[42104] = 69109
mem[43065] = 51339
mem[54748] = 38601
mem[28726] = 327509
mask = 11111XX111011010001000X100X0X1000010
mem[31131] = 8394226
mem[17696] = 130438
mem[33864] = 470
mem[12127] = 17581557
mem[27845] = 5393132
mem[9748] = 2834812
mem[61412] = 166641
mask = 00X0101010000001000010111000X01X00X0
mem[57586] = 7884345
mem[30282] = 9009557
mem[56640] = 17908
mask = 00101010101X000X101X0111X00000110110
mem[48890] = 264
mem[55478] = 70798290
mem[33850] = 2673816
mem[29126] = 1634545
mem[18999] = 427
mem[12398] = 3955445
mem[53860] = 14815
mask = 1X10X11011110X0010000011101X1111X11X
mem[5887] = 178781
mem[8626] = 11018149
mem[25552] = 6147464
mask = X1XXX111110X101000XX00X10101001X0000
mem[15181] = 1627
mem[16466] = 15581
mem[9144] = 7114
mem[26239] = 4684
mask = 0010011X1X0100X00000X1X1110X1X111X1X
mem[22571] = 8198016
mem[32208] = 63929669
mem[31141] = 2499
mem[58353] = 2029848
mask = 011X1011110100X0000010000X000110X101
mem[40785] = 32152273
mem[117] = 2778
mem[46519] = 13080473
mem[54258] = 4708
mem[49303] = 57830
mask = X01X1XX01011X00110XX011100000111X01X
mem[20234] = 1730
mem[28710] = 3601452
mem[64152] = 2219
mem[22571] = 587307
mask = 00X0100X101000011010X01X100X10001010
mem[12316] = 199812981
mem[54599] = 392921
mem[35478] = 133360825
mem[1493] = 509914088
mask = X010X11011010X0000X101X10000XX101X1X
mem[31499] = 538
mem[31667] = 499292
mem[28834] = 1672336
mem[12376] = 731047655
mask = 0X11011111011X100X1X000000X101000010
mem[34112] = 669
mem[43870] = 281
mem[45070] = 597126299
mem[21808] = 2038211
mem[44910] = 6681
mem[863] = 70840
mask = X01X011010110110100XX101100011X10100
mem[46874] = 9952
mem[24868] = 2783
mem[22955] = 3913
mem[7815] = 497
mem[40836] = 3977
mask = 0110XX11010101001001000100XXX1100X01
mem[20936] = 571
mem[34020] = 272043175
mem[49239] = 2353"""
    
    def solution1(in:String): Long = {
    
        def toMask(s:String) =  s.substring(7).toList.reverse
    
        def applyMask(m:List[Char],x:String) = {
            val value = x.split(" = ").toList.last.toInt.toBinaryString.toList.reverse
            // println("apply " + m + " on " + value)
            val resultS = value.zipAll(m, "0", "").map{ // reverse and apply mask bit by bit with zip
                case (a, 'X') => a
                case (_, '0') => '0'
                case (_, '1') => '1'
            }.reverse.mkString //then reverse and convert to string then to int from base 2
            val resultMapEntry = (x.split(']').toList.head.split('[').toList.last -> new java.math.BigInteger(resultS, 2)) // return Map Value
            // println(value + "->" + resultMapEntry)
            resultMapEntry            
        }
        
        def dosmthing(m:List[Char], x:String, t:List[String], acc: Map[String,java.math.BigInteger]):Long = {
            val typel = x.substring(0, 4)
            if (typel == "mask") {
               //print("new mask:" + x)
               sumAccumulator(toMask(x), t, acc) // change mask
           }
            else
               sumAccumulator(m, t, acc + applyMask(m,x)) // apply mask op
        }
    
        def sumAccumulator(mask:List[Char], mems: List[String], accum: Map[String, java.math.BigInteger]): Long = {        
          mems match {
            case Nil => {
                println(accum)
                accum.foldLeft(0L)(_+_._2.longValue()) // sum values (._2)
            }
            case x :: tail => dosmthing(mask, x, tail, accum)
          }
        }
        
        val lines: List[String] = in.split("\n").toList
        sumAccumulator(toMask(lines.head), lines.tail, Map.empty[String, java.math.BigInteger])        
      }
      
    
    // println(solution1(input))
    
    def solution2(in:String): Long = {
    
        def toMask(s:String) =  s.substring(7).toList.reverse
        
        def leftPad(str:String, paddedLength:Int) : String = {
            var remLength = paddedLength - str.length;
            if (remLength <= 0) {
              return str;
            }
            val builder = new StringBuilder()
            for( a <- 0 until remLength){
              builder.append('0');
            }
            builder.append(str);
            return builder.toString();
        }
            
        def generateAddresses(str:String, value:Int) = {    
            val nbX = Math.pow(2,str.count(_ == 'X')).toInt -1
            //get all the indices with possible value 0 or 1
            val xs = LazyList.iterate(str.indexOf("X"))(x => str.indexOf("X",x+1)).takeWhile(_>=0).toList
            // combinations of index/char to put                      
            val combis:List[Map[Int, Char]] = (0 to nbX).map(_.toBinaryString).map(x=>leftPad(x,xs.length)).map(x => xs.zip(x).toMap).toList
            // build all possible adresses
            val adresses = combis.map{combo => combo.map(_._1).foldLeft(str)((s, i) => {s.updated(i, combo(i))})}.map(x => new java.math.BigInteger(x, 2))
            // return a map
            val result = adresses map {s => (s, value)}
            // println(result)
            result
        }
        
        def applyMask(m:List[Char],x:String) = {
            val value = x.split(" = ").toList.last.toInt
            val address = x.split(']').toList.head.split('[').toList.last.toInt.toBinaryString.toList.reverse            
            val resultS = address.zipAll(m, "0", "").map{ // reverse and apply mask bit by bit with zip
                case (_, 'X') => 'X'
                case (a, '0') => a
                case (_, '1') => '1'
            }.reverse.mkString //then reverse and convert to string then to int from base 2
            // println("res:" + resultS)
            generateAddresses(resultS, value)
        }
        
        def dosmthing(m:List[Char], x:String, t:List[String], acc: Map[java.math.BigInteger,Int]):Long = {
            val typel = x.substring(0, 4)
            if (typel == "mask")
               sumAccumulator(toMask(x), t, acc)
            else
               sumAccumulator(m, t, acc ++ applyMask(m,x))
        }
        
        def sumAccumulator(mask:List[Char], mems: List[String], accum: Map[java.math.BigInteger, Int]): Long = {        
          mems match {
            case Nil => {
                // println(accum)
                accum.foldLeft(0L)(_+_._2.longValue())
            }
            case x :: tail => dosmthing(mask, x, tail, accum)
          }
        }
        
        val lines: List[String] = in.split("\n").toList
        sumAccumulator(toMask(lines.head), lines.tail, Map.empty[java.math.BigInteger,Int])        
      }
      
      println(solution2(input))
 }
