import { Directive, ElementRef, HostBinding, HostListener } from '@angular/core';




@Directive(
    {
        selector : '[cdir]'
    }
)




export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'black';
        this.el.nativeElement.style.color = 'white';
    }

   @HostBinding('style.backgroundColor') backgroundColor = 'white';
   @HostBinding('style.color') color = 'black';


   @HostListener('mouseenter') meEvent() {
       this.el.nativeElement.style.color = 'brown';
   }
   @HostListener('mouseleave') meLeave() {
    this.el.nativeElement.style.color = 'black';
}
}
