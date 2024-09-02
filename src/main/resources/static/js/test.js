let sciNotNum = 1.00e7;

function convert(convertee){
    return convertee.toString().replace("e", " * 10^");
}

console.log(convert(sciNotNum))