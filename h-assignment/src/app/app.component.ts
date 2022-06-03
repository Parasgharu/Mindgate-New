import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'h-assignment-angular';

  // displayDetails :boolean=false;
  // numberOfTimesClickes:number=0;
  // count :number []=[];

   // ondisplayDetails(){
  //   this.displayDetails=!(this.displayDetails);
  //   console.log(this.displayDetails);
  //   this.numberOfTimesClickes++;
  //   this.count.push(this.numberOfTimesClickes);

  // }

  showSecret: boolean =false;
  counter : number[]=[];
  numbersArray : number[]=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];

  onToggleDisplay(){
    this.showSecret= !this.showSecret;
    this.counter.push(this.counter.length+1);
  }

  getColor(count : number){
    return count >5 ?'blue': 'transparent';
  }

  



}
