export class Product {
    constructor(public id : number,
                public sku : string,
                public name : string,
                public description : string,
                public unitPrice : number,
                public imageUrl : string,
                public active : any,
                public unitsInStock : number,
                public dateCreated : any,
                public lastUpdated : any,
                public categoryId : number){}
}
