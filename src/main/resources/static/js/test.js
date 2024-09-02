const genericinfo = {
    mass: 5e+28,
    volume: 7e+9,
    standmass: function() {
        return BigInt(this.mass).toString();
    }
};

console.log(genericinfo.standmass());
console.log(genericinfo.mass.toExponential().replace(/e\+?/, ' x 10^'))