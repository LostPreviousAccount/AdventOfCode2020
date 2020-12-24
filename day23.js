const ex1 = "389125467";
const input = "952316487";

var shouldLog = false;

const solution = (cups, rounds) => {    
    //log(cups);
    var i = 0;
    var index = 0;
    while(i++ < rounds) {
    	cups = playRound(i, cups, index);
        index = next(index, cups);
    }
    log("-- final --");
    log(cups);
    log(" ==> ");
    return cups;
}

const solution1 = (str) => {
    const cups = solution(str.split('').map(x => parseInt(x,10)), 100);
    shouldLog = true;
    log(rotate(cups, 1, 0).slice(1).join(""));
}

const pick = (cups, currCupIdx) => {
    var pickup = cups.splice(next(currCupIdx, cups), 3);
    if (pickup.length < 3)
    	pickup = pickup.concat(cups.splice(0, 3-pickup.length));
	return pickup;
}

const rotate = (nCups, currCup, currCupIdx) => {
	while(nCups.indexOf(currCup) != currCupIdx) {
    	nCups.push(nCups.shift());
    }
    return nCups;
}

const minus1 = (cup, cups) => cup == 1 ? (cups.length+3) : cup-1;
const next = (cupIdx, cups) => (cupIdx+1) % cups.length;

const destinationIdx = (cups, cupToLook) => {
	const idx = cups.indexOf(cupToLook);
    //log("["+cups+"] --> "+cupToLook+"="+idx);
    return (idx == -1) ? (destinationIdx(cups, minus1(cupToLook, cups))) : idx;
}

const log = (smthing) => shouldLog ? document.write(smthing+"<br/>") : ""; // or console.log()

//solution1(ex1);

// PART 2
const solution2 = (str) => {    
    shouldLog = false;
    const strArr = str.split('').map(x => parseInt(x,10));
    for(var i=0;i<strArr.length-1;i++){cups.set(strArr[i], strArr[i+1]);}
    cups.set(strArr[strArr.length-1], 10);
    log(Array.from(cups));
    // 100000 trucs...
    for(var i=10;i<1000000;i++){cups.set(i, i+1);}
    cups.set(1000000, strArr[0]);
    var i = 0;
    var currCup = strArr[0];
    while(i++ < 10000000) {
        log("Move:" + i);
    	log("current:" + currCup);
        const pickup1 = cups.get(currCup);
        const pickup2 = cups.get(pickup1);
        const pickup3 = cups.get(pickup2);
        const next = cups.get(pickup3);
        cups.set(currCup, next);
        log("pickup: " + pickup1 + ","+ pickup2 + ","+ pickup3);
        //
        var dest = currCup == 1 ? cups.size : currCup-1;
        while(dest == pickup1 || dest == pickup2 || dest == pickup3) {
            dest = dest == 1 ? cups.size : dest-1;
        }
        log("destination:" + dest);
        //
        const after = cups.get(dest);
        cups.set(dest, pickup1);
        cups.set(pickup3, after);
        //log(Array.from(cups));
        currCup = next;
    }        
    const after1 = cups.get(1);
    const after2 = cups.get(after1);
    shouldLog = true;
    log(after1 +" | "+ after2);
    log(" ==> ");
    log((after1*after2));
}

//solution2(ex1);
